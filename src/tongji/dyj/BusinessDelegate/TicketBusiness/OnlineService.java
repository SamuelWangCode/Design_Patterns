package tongji.dyj.BusinessDelegate.TicketBusiness;

public class OnlineService implements BusinessService {
    //构造函数
    public OnlineService(){}

    @Override
    public void TicketSale() {
        System.out.println("OnlineService : ("+this.hashCode()+"):"+" TickedSale : "+"Buy tickets online");
    }
}
