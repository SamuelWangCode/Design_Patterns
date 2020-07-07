package tongji.zyd.Strategy.Parade.Employee;

import tongji.zyd.Strategy.Parade.Strategy.ChristmasParadeStrategy;
import tongji.zyd.Strategy.Parade.Strategy.HalloweenParadeStrategy;

/*
 * 表演者类，实现了Employee接口声明的方法
 * 为不同的巡游策略进行不同的表演
 */
public class Performer implements Employee {

    /*
     * 为圣诞节巡游进行表演
     * 接受圣诞节巡游策略作为参数
     * @param strategy
     * @throws InterruptedException
     */
    private String class_desc="Performer : ("+this.hashCode()+") : ";
    @Override
    public void workForParade(ChristmasParadeStrategy strategy) throws InterruptedException {
        System.out.println(class_desc+"为巡游 \"Let it snow\" Christmas Parade 进行表演");
    }

    /*
     * 为万圣节巡游进行表演
     * 接受万圣节巡游策略作为参数
     * @param strategy
     * @throws InterruptedException
     */
    @Override
    public void workForParade(HalloweenParadeStrategy strategy) throws InterruptedException {
        System.out.println(class_desc+"为巡游 \"Glow in the Park\" Halloween Parade 进行表演");
    }
}
