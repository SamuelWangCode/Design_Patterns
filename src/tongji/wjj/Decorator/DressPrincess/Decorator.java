package tongji.wjj.Decorator.DressPrincess;

/**
 * 所有装饰类的父类，是一个抽象类。
 * 所有具体的装饰类将继承它，并实现其中的抽象方法dress()。
 * 公主类型的对象作为装饰类中的成员，实际指向的是实现了AbstractPrincess接口的类。
 */
public abstract class Decorator {
    AbstractPrincess princess;

    /**
     * Decorator类的构造函数，以AbstractPrincess类型对象为参数，实际上传递的是具体的公主类，用其初始化princess变量
     * 表示该装饰器要装饰的公主对象。
     * @param x 要装饰的公主对象。
     */
    public Decorator(AbstractPrincess x) {
        princess = x;
    }

    /**
     * 为公主进行具体着装的抽象方法，将在子类中，根据着装风格具体实现。
     * @throws InterruptedException
     */
    public abstract void dress() throws InterruptedException;
}
