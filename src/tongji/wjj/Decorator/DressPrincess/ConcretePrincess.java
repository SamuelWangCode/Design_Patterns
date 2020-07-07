package tongji.wjj.Decorator.DressPrincess;

/**
 * 具体公主类。是装饰器实际要装饰的对象。
 * ConcretePrincess
 */
public class ConcretePrincess implements AbstractPrincess {
    private String suit;
    public String name;

    /**
     * 具体的公主类的构造函数。设置公主的名字，并将着装设置为默认值。
     * @param name 公主名字
     */
    public ConcretePrincess(String name) {
        this.name = name;
        suit = "default";
    }

    /**
     * 重写AbstractPrincess接口中的方法，公主展示她的套装。
     */
    @Override
    public void show() {
        System.out.println("DecoratorController : ("+this.hashCode()+") : "+"公主"+name+"开始展示她的套装："+suit);
    }

    /**
     * 公主设置套装为指定值。
     * @param x 套装名字
     */
    @Override
    public void setSuit(String x) {
        suit = x;
    }

    /**
     * 获取公主名字。
     * @return 公主的名字
     */
    @Override
    public String getName() {
        return name;
    }
}
