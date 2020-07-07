package tongji.dyj.State.Disneyland;

/**
 * 游乐园游客较多的状态（>30）
 * 游客较多的情况下  票价为680元
 * 状态自身只产生一个实例，因此使用单例模式
 */
public class FullState extends State {
    //单例模式
    private static FullState instance=null;
    private FullState(){
        ticketPrice=680;
    }
    public static FullState getInstance(){
        if(instance==null){
            instance=new FullState();
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
    //旺季入园
    @Override
    public void peopleEnter(Disneyland land){
        System.out.println("FullState : ("+this.hashCode()+"):"+" PeopleEnter : "+"游客入园，旺季票价为："+ticketPrice);
    }
    //旺季出园，人数少于20切换到常规状态
    @Override
    public void peopleOut(Disneyland land){
        System.out.println("FullState : ("+this.hashCode()+"):"+" PeopleOut : "+"游客出园，旺季票价为："+ticketPrice);
        if(land.getVisitorNum()<=20){
            land.setState(NormalState.getInstance());
        }
    }
}
