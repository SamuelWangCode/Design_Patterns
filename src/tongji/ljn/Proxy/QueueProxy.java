package tongji.ljn.Proxy;

/**
 * 创建代理对象类QueueProxy,即跑腿代排，并通过代理类创建真实对象实例并访问其排队方法
 */
public class QueueProxy implements QueueSubject{
    String location="";
    String descStr="QueueProxy("+this.hashCode()+"):";

    /**
     * 构造函数，提供排队地点
     * @param location
     */
    QueueProxy(String location){
        this.location = location;
    }

    /**
     * 获得地点
     * @return
     */
    String getLocation(){
        System.out.println(descStr+"getLocation");
        return this.location;
    }

    /**
     * 重写排队的方法
     * @throws InterruptedException
     */
    @Override
    public void queueForFireworkShow() throws InterruptedException {
        //引用并创建真实对象实例，即有看烟花需求的游客
        RealQueueSubject realQueueSubject = new RealQueueSubject();
        //调用真实的排队方法，进行代理排队
        realQueueSubject.queueForFireworkShow();
        //排队时间好漫长
        Thread.sleep(1000);
        //向主子报告排队地点
        System.out.println("观看地点："+this.getLocation());
    }
}
