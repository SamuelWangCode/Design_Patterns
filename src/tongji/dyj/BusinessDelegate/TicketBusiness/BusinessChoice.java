package tongji.dyj.BusinessDelegate.TicketBusiness;

/**
 * 业务选择类
 * 通过该类选择具体的购票方式
 */
public class BusinessChoice {
    //构造函数
    public BusinessChoice(){}

    public BusinessService getBusiness(String serviceType){
        if(serviceType.equalsIgnoreCase("Online")){
            return new OnlineService();
        }
        else if (serviceType.equalsIgnoreCase("Offline")){
            return new OfflineService();
        }
        else
            return null;
    }
}
