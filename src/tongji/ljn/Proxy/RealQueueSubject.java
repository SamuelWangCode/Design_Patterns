package tongji.ljn.Proxy;

/**
 * 创建真实对象类RealQueueSubject，即有看烟花秀需求的游客
 */
public class RealQueueSubject implements QueueSubject{
    private String descStr="RealQueueSubject("+this.hashCode()+"):";

    /**
     * 为看烟花排队的方法
     * @throws InterruptedException
     */
    @Override
    public void queueForFireworkShow() throws InterruptedException {
        System.out.println(descStr+"queueForFireworkShow:");
        System.out.println("为看烟花排队ing");
    }
}
