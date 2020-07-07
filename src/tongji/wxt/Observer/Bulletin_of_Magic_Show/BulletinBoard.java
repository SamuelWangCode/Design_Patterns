package tongji.wxt.Observer.Bulletin_of_Magic_Show;


/**电子公告板
 * 消息接收者的一个样例
 * 接收并显示从Publisher得到的信息
 * 当Publisher源信息改变时会随着改变
 */
public class BulletinBoard implements MyObserver {
    private String info =null;

    public void setInfo(String s){
        this.info = s;
    }

    /**
     * 打印信息
     * tips为对新信息的一个描述或提示，如不需要可以输入为null
     * @param tips
     */
    public void printInfo(String tips){
        System.out.println(descStr + "printInfo : Bulletin Shows : ");
        System.out.printf(descStr + "printInfo :"+"\n" + "      %s     ", tips );
        System.out.println(descStr + "printInfo : "+"\n"+ this.info);
    }

    /**
     *重写接口中的update方法
     * 改变自身信息并打印显示
     * @param target
     * @param tips
     */
    @Override
    public void update(InfoPublisher target, Object tips) {
        this.setInfo(target.getInfo());
        this.printInfo((String)tips);
    }

    private String descStr = this.getClass().getSimpleName() +" ("+ this.hashCode() + ") : ";
}
