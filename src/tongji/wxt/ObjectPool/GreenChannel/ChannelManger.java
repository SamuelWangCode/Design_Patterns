package tongji.wxt.ObjectPool.GreenChannel;

import java.util.HashMap;


/**
 * 对象池类，负责创建和管理绿色通道对象
 * 出于简便考虑，对象池提供固定数目的对象（5个）
 * 当所有对象均被使用时，新的申请将被驳回，需要经过等待后重新申请
 */
public class ChannelManger {
    private HashMap<GreenChannel, ChannelStatus> pool;  //对象池
    private int poolSize = 5;  //对象池默认大小

    /**
     * 用于表示对象当前可用状态的内部类
     */
    private class ChannelStatus {
        private boolean status = true;

        public void setUsing(){
            status = false;
        }

        public void setFree(){
            status = true;
        }

        public boolean validate(){
            return this.status;
        }
    }

    public ChannelManger(){
        this.pool = new HashMap<GreenChannel, ChannelStatus>();
        for (int i = 0; i < this.poolSize; i++) {
            this.pool.put(new GreenChannel(), new ChannelStatus());
        }
    }

    /**
     * 从对象池中取出一个空闲状态的对象
     * 如果没有返回null
     * @return 返回空闲对象，没有则为null
     */
    private GreenChannel find(){
        for (GreenChannel channel: this.pool.keySet()) {
            if(this.pool.get(channel).validate()){
                this.pool.get(channel).setUsing();
                return channel;
            }
        }
        System.out.println(descStr + "find : All channels are busy. Please try again later.");
        return null;
    }

    /**
     * 外部申请对象的接口
     * @return 返回空闲对象， 没有则为null
     */
    public GreenChannel getChannel(){
        return this.find();
    }

    /**
     * 将归还的对象放入对象池，并将状态设为空闲
     * @param channel 归还的对象
     */
    private void free(GreenChannel channel){
        this.pool.get(channel).setFree();
        System.out.println(descStr + "free : A Channel has benn returned.");
    }

    /**
     * 归还对象的外部接口
     * @param channel 归还的对象
     */
    public void returnChannel(GreenChannel channel){
        this.free(channel);
    }
    private String descStr = this.getClass().getSimpleName() +" ("+ this.hashCode() + ") : ";

}
