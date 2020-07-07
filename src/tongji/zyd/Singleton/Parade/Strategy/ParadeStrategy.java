package tongji.zyd.Singleton.Parade.Strategy;
import tongji.zyd.Singleton.Parade.Employee.Employee;

/*
 * 抽象基类，巡游表演的策略方案
 * 作为策略模式中的策略，提供了抽象方法accept
 * 作为访问者模式中的被访问者，提供了抽象方法accept接受访问者的访问
 */
public abstract class ParadeStrategy {
    /*
     * 接受访问者的访问，参数为访问者
     * @param visitor
     * @throws InterruptedException
     */
    protected String class_desc;
    public abstract void accept(Employee visitor) throws InterruptedException;
}
