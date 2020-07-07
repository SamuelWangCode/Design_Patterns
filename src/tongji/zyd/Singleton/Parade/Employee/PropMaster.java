package tongji.zyd.Singleton.Parade.Employee;

import tongji.zyd.Singleton.Parade.Strategy.ChristmasParadeStrategy;
import tongji.zyd.Singleton.Parade.Strategy.HalloweenParadeStrategy;

/*
 * 道具师类，实现了Employee接口声明的方法
 * 为不同的巡游策略准备不同的道具
 */
public class PropMaster implements Employee {

    /*
     * 为圣诞节巡游准备道具
     * 接受圣诞节巡游策略作为参数
     * @param strategy
     * @throws InterruptedException
     */
    private String class_desc="PropMaster : ("+this.hashCode()+") : ";
    @Override
    public void workForParade(ChristmasParadeStrategy strategy) throws InterruptedException {
        System.out.println(class_desc+"为巡游 \"Let it snow\" Christmas Parade 准备道具");
    }

    /*
     * 为万圣节巡游准备道具
     * 接受万圣节巡游策略作为参数
     * @param strategy
     * @throws InterruptedException
     */
    @Override
    public void workForParade(HalloweenParadeStrategy strategy) throws InterruptedException {
        System.out.println(class_desc+"为巡游 \"Glow in the Park\" Halloween Parade 准备道具");
    }
}
