package tongji.dyj.BusinessDelegate;

import tongji.dyj.BusinessDelegate.TicketBusiness.BusinessDelegate;
import tongji.dyj.BusinessDelegate.TicketBusiness.Client;

public class Main {

    public static void main(String[] args) {test(); }

    public static void test(){
        System.out.println("迪士尼购票系统：");
        BusinessDelegate businessDelegate=new BusinessDelegate();
        businessDelegate.setServiceType("Online");

        Client client=new Client(businessDelegate);
        client.buyTicket();
        businessDelegate.setServiceType("Offline");
        client.buyTicket();
    }
}
