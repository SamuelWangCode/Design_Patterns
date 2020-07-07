package tongji.wxt.ObjectPool.GreenChannel;

/**
 * 绿色通道，对象池中存放的对象
 * 用于提供具体的工作
 * 在此简写，只实现开始和结束工作的函数
 * 对象的分配和回收均有对象池管理
 */
public class GreenChannel {

    public void startWork(){
        System.out.println(descStr + "startWork : Green Channel starts to work.");
    }

    public void endWork(){
        System.out.println(descStr + "endWork : Green Channel stops work.");
    }

    private String descStr = this.getClass().getSimpleName() +" ("+ this.hashCode() + ") : ";
}
