package tongji.dyj.BusinessDelegate.TicketBusiness;

/**
 * 客户端类
 * 通过代理类执行购票操作
 */
public class Client {
    BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate){
        this.businessDelegate=businessDelegate;
    }
    public void setBusinessDelegate(BusinessDelegate delegate){
        if(delegate!=null&&delegate!=businessDelegate){
            businessDelegate=delegate;
        }
    }

    public void buyTicket(){
        if(businessDelegate!=null){
            businessDelegate.buyTicket();
        }
        else {
            System.out.println("请先设置业务代理!");
        }
    }
}
