package tongji.wxt.ObjectPool.GreenChannel;


import java.util.ArrayList;

/**
 * 测试类
 * 封装了一个对象池类，也即对象管理器
 * 通过Client调用对象池的相关操作达到测试目的
 */
public class Client {
    /**
     * 该用户的对象池和已申请到的对象列表
     */
    private ChannelManger manger;
    private ArrayList<GreenChannel> myChannel;

    public Client(){
        this.manger = new ChannelManger();
        this.myChannel = new ArrayList<GreenChannel>();
    }

    /**
     * 申请使用对象
     */
    public void applyChannel(){
        GreenChannel tmp = this.manger.getChannel();
        if (tmp != null){
            this.myChannel.add(tmp);
            System.out.println(descStr + "applyChannel : A GreenChannel is ready.");
            tmp.startWork();
        }

    }

    /**
     * 归还对象
     */
    public void PopChannel(){
        GreenChannel tmp = this.myChannel.remove(0);
        tmp.endWork();
        this.manger.returnChannel(tmp);
    }

    private String descStr = this.getClass().getSimpleName() +" ("+ this.hashCode() + ") : ";
}
