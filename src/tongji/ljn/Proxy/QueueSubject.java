package tongji.ljn.Proxy;

/**
 * 创建用来排队看烟花的抽象对象接口QueueSubject
 * 来了迪士尼，怎么能错过最精彩的烟花秀呢？但难得的游览机会又怎么可以浪费在排队这件事上呢？
 * 都想看烟花秀，要看得排队才能获得最佳观赏角度，可人那么多，得排到什么时候？
 * 提供跑腿代排服务哦！！！
 * 声明真实对象需要让代理对象做的事情，这里是为看烟花排队
 */
public interface QueueSubject {
    public void queueForFireworkShow() throws InterruptedException;
}


