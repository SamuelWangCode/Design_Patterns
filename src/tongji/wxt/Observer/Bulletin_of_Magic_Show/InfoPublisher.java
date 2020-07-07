package tongji.wxt.Observer.Bulletin_of_Magic_Show;

import java.util.Arrays;
import java.util.Vector;


/**
 * 消息发布类
 * 信息修改、发布控制终端，修改其中的信息可使所有其管理的接收者改变信息
 */
public class InfoPublisher {
    private Vector<MyObserver> publishScope;      //消息接收者容器
    private String Info = null;                   //终端源信息。所有接收者信息与此相同

    public InfoPublisher(){
        this.publishScope = new Vector<MyObserver>();
    }

    /**
     * 添加消息接收者，必须为实现了MyObserver接口的类型
     * 实现了两种添加方式，直接添加一个或以数组方式整体添加
     * @param ob
     */
    public void addObserver(MyObserver ob){
        this.publishScope.addElement(ob);
    }

    public void addObserver(MyObserver[] arr){
        this.publishScope.addAll(Arrays.asList(arr));
    }

    public void removeObserver(MyObserver ob){
        this.publishScope.removeElement(ob);
    }

    public String getInfo(){
        return this.Info;
    }

    /**
     * 关键方法
     * 改变终端源信息，并随即调用notify方法，将新信息发布到所有观察者
     * @param newInfo
     * @param tips
     */
    public void changeInfo(String newInfo, String tips){
        System.out.println(descStr + "changeInfo : The last information is :" + this.Info);
        this.Info = newInfo;
        this.notify(tips);
    }

    /**
     * 发布
     * 将信息发布到所有的观察者
     * 声明为私有方法，避免外界重复调用，只有在源信息改变（即changeInfo方法被调用）时才会被触发
     * @param tips
     */
    private void notify(String tips){
        System.out.println(descStr + "notify : The new information is : " +"\n"+ this.Info);
        for (MyObserver ob: publishScope) {
            ob.update(this, tips);
            System.out.println(descStr + "notify : Bulletin Board hsa been changed.");
        }
    }

    private String descStr = this.getClass().getSimpleName() +" ("+ this.hashCode() + ") : ";
}
