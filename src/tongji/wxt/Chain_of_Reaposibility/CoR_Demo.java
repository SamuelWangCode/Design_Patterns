package tongji.wxt.Chain_of_Reaposibility;

import tongji.wxt.Chain_of_Reaposibility.AnnualCardService.*;

public class CoR_Demo {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        // 创建顾客，依次为周日年卡、平日+周日年卡和无限年卡会员
        Customer customerA = new Customer(AnnualCardLevel.Sunday);
        Customer customerB = new Customer(AnnualCardLevel.SundayPlus);
        Customer customerC = new Customer(AnnualCardLevel.AllDays);
        Customer customerD = new Customer(AnnualCardLevel.Nothing);

        //装配责任链，1级为周日年卡，2级为平日+周日年卡， 3级为无限年卡
        Handler SundayServicer = new SundayCardHandler();
        Handler SundayPlusServicer = new SundayPlusHandler();
        Handler AllDaysServicer = new AllDaysHandler();

        SundayServicer.setNextHandler(SundayPlusServicer);
        SundayPlusServicer.setNextHandler(AllDaysServicer);

        //开始测试，顾客进入顺序任意，只需要从第一级开始进入测试即可
        SundayServicer.ProvideService(customerA);
        SundayServicer.ProvideService(customerB);
        SundayServicer.ProvideService(customerC);
        SundayServicer.ProvideService(customerD);



    }
}
