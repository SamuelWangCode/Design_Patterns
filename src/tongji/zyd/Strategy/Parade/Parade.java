package tongji.zyd.Strategy.Parade;

import tongji.zyd.Strategy.Parade.Employee.Performer;
import tongji.zyd.Strategy.Parade.Employee.PropMaster;
import tongji.zyd.Strategy.Parade.Strategy.ParadeStrategy;

public class Parade {
    private ParadeStrategy paradeStrategy;
    private PropMaster propMaster;
    private Performer performer;
    private String class_desc="Parade : ("+this.hashCode()+") : ";
    /*
     * 构建一次巡游，参数为该次巡游所使用的策略
     * @param strategy
     */
    public Parade(ParadeStrategy strategy){
        this.paradeStrategy=strategy;
        this.performer = new Performer();
        this.propMaster = new PropMaster();
    }

    /*
     * 进行巡游
     * @throws InterruptedException
     */
    public void show() throws InterruptedException{
        try{
            if((this.paradeStrategy==null||this.propMaster==null||this.performer==null)){
                throw new InterruptedException();
            }
            prepareParade();
            startParade();
            endParade();
        }catch (Exception e){
            System.out.println(class_desc+"show : 巡游出现问题，巡游中止");
            System.out.println(class_desc+"show : Error:"+e.getMessage());
        }

    }

    /*
     * 切换巡游所使用的策略类型
     * @param strategy
     */
    public void setStrategy(ParadeStrategy strategy) throws InterruptedException{
        System.out.println(class_desc+"setStrategy : 设置巡游方案策略");
        this.paradeStrategy=strategy;
    }

    private void prepareParade() throws InterruptedException{
        System.out.println(class_desc+"prepareParade : 为巡游做准备");
        this.paradeStrategy.accept(propMaster);
    }

    private void startParade() throws InterruptedException{
        System.out.println(class_desc+"startParade : 开始巡游");
        this.paradeStrategy.accept(performer);
    }

    private void endParade() throws InterruptedException{
        System.out.println(class_desc+"endParade : 结束巡游");
    }
}
