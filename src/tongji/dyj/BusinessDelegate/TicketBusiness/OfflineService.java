package tongji.dyj.BusinessDelegate.TicketBusiness;

public class OfflineService implements BusinessService {
    //构造函数
    public OfflineService(){}

    @Override
    public void TicketSale() {
        System.out.println("OfflineService : ("+this.hashCode()+"):"+" TickedSale : "+"Buy tickets Offline");
    }
}
