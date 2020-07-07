package tongji.ljn.Proxy;

/**
 * Proxy设计模式
 */
public class QueueProxyDemo {
    public static void main(String[] args) throws InterruptedException {
        test();
    }
    public static void test() throws InterruptedException {
        System.out.println("欢迎来到烟花代排~");

        //创建一个代排对象，让其到最佳观赏地点米奇大街排队
        QueueProxy proxy = new QueueProxy("米奇大街");
        //代排开始
        proxy.queueForFireworkShow();
        System.out.println("享受美丽动人的烟花秀吧~");
    }
}
