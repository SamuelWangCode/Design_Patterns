package tongji.zyd.Visitor.Parade.Strategy;

import tongji.zyd.Visitor.Parade.Employee.Employee;

/*
 * 万圣节巡游策略，继承自ParadeStrategy
 * 由于该策略仅用于提供于巡游相关的信息，使用过程中自身内容不会发生改变，故使用单例模式
 */
public class HalloweenParadeStrategy extends ParadeStrategy {
    /*
     * 接受工作人员的访问，调用其workForParade方法完成对自身的访问，实现相应功能
     * 参数为访问者
     * @param visitor
     * @throws InterruptedException
     */
    @Override
    public void accept(Employee visitor) throws InterruptedException {
        System.out.println(class_desc+"accept : 接受工作人员访问");
        visitor.workForParade(this);
    }

    static private ParadeStrategy instance;
    /*
     * 获取单例
     * 使用双重校验锁完成线程安全的懒汉式单例模式
     */
    static public ParadeStrategy getInstance(){
        if(instance==null){
            synchronized (HalloweenParadeStrategy.class){
                if(instance==null){
                    instance=new HalloweenParadeStrategy();
                }
            }
        }
        System.out.println(instance.class_desc+"getInstance : 获取单例");
        return instance;
    }

    /*
     * 单例模式构造函数为private
     */
    private HalloweenParadeStrategy(){
        class_desc="HalloweenParadeStrategy : ("+this.hashCode()+") : ";
    }
}
