package tongji.zyd.Strategy.Parade.Employee;

import tongji.zyd.Strategy.Parade.Strategy.ChristmasParadeStrategy;
import tongji.zyd.Strategy.Parade.Strategy.HalloweenParadeStrategy;

/*
 * 巡游表演中工作人员需要实现的接口
 * 作为访问者模式中的访问者，访问对象为巡游表演策略
 * 该接口为每一种巡游表演方案提供了一个workForParade方法作为访问方法
 * 不同工作人员对不同的巡游表演方案进行不同的工作
 */
public interface Employee {
    /*
     * 为圣诞节巡游进行工作
     * 接受圣诞节巡游策略作为参数
     * @param strategy
     * @throws InterruptedException
     */
    public void workForParade(ChristmasParadeStrategy strategy) throws InterruptedException;

    /*
     * 为万圣节巡游进行工作
     * 接受万圣节巡游策略作为参数
     * @param strategy
     * @throws InterruptedException
     */
    public void workForParade(HalloweenParadeStrategy strategy) throws InterruptedException;
}
