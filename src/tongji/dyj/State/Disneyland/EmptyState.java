package tongji.dyj.State.Disneyland;

/**
 * 游乐园游客较少的状态（0~10）
 * 游客较少的情况下  票价为380元
 * 状态自身只产生一个实例，因此使用单例模式
 */
public class EmptyState extends State {
    //单例模式
    private static EmptyState instance=null;
    private EmptyState(){
        ticketPrice=380;
    }
    public static EmptyState getInstance(){
        if(instance==null){
            instance=new EmptyState();
        }
        return instance;
    }
    //票价
    private int ticketPrice;
    public int getTicketPrice() {
        return ticketPrice;
    }
    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    //淡季游客入园，当游客人数大于10人，切换到常规状态
    @Override
    public void peopleEnter(Disneyland land){
        System.out.println("EmptyState : ("+this.hashCode()+"):"+" PeopleEnter : "+"游客入园，淡季票价为："+ticketPrice);
        if(land.getVisitorNum()>=10){
            land.setState(NormalState.getInstance());
        }
    }
    //淡季游客出园
    @Override
    public void peopleOut(Disneyland land){
        System.out.println("EmptyState : ("+this.hashCode()+"):"+" PeopleOut : "+"游客出园，淡季票价为："+ticketPrice);
    }
}
