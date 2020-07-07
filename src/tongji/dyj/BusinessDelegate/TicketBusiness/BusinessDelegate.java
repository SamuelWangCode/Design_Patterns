package tongji.dyj.BusinessDelegate.TicketBusiness;

/**
 * 售票业务代理类，用户通过代理类购票
 */
public class BusinessDelegate {
    //构造函数
    public BusinessDelegate(){
        choice=new BusinessChoice();
        service=null;
        serviceType=null;
    }

    private BusinessChoice choice=new BusinessChoice();
    private BusinessService service;
    private String serviceType;
    //设置购票的方式
    public void setServiceType(String type){
        if(type!=null&&type!=serviceType){
            serviceType=type;
        }
    }
    //根据设置的购票方式购票
    public void buyTicket(){
        if(serviceType!=null){
            service=choice.getBusiness(serviceType);
            if(service!=null){
                service.TicketSale();
            }
            else {
                System.out.println("请输入正确的购票方式：Online/Offline");
            }

        }
    }
}
