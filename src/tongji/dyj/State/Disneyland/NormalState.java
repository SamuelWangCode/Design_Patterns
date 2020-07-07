package tongji.dyj.State.Disneyland;

/**
 * 游乐园游客常规的状态（11~20）
 * 票价为500元
 * 状态自身只产生一个实例，因此使用单例模式
 */
public class NormalState extends State{
    //单例模式
    private static NormalState instance=null;
    private NormalState(){
        ticketPrice=500;
    }
    public static NormalState getInstance(){
        if(instance==null){
            instance=new NormalState();
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
    //常规时间入园，人数超过20，切换到旺季状态
    @Override
    public void peopleEnter(Disneyland land){
        System.out.println("NormalState : ("+this.hashCode()+"):"+" PeopleEnter : "+"游客入园，常规票价为："+ticketPrice);
        if(land.getVisitorNum()>=20){
            land.setState(FullState.getInstance());
        }
    }
    //常规时间出园，人数低于10，切换到淡季状态
    @Override
    public void peopleOut(Disneyland land){
        System.out.println("NormalState : ("+this.hashCode()+"):"+" PeopleOut : "+"游客出园，常规票价为："+ticketPrice);
        if(land.getVisitorNum()<=10){
            land.setState(EmptyState.getInstance());
        }
    }
}
