package tongji.yzc.FrontController;

import tongji.yzc.FrontController.DisneyServiceCenter.DisneyServiceCenter;

public class FrontControllerDemo {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        DisneyServiceCenter disneyServiceCenter = new DisneyServiceCenter();
        disneyServiceCenter.dispatchRequest("FoodProblem", "迪士尼的饭怎么这么贵呀？");
        disneyServiceCenter.dispatchRequest("FacilityProblem", "这个过山车多高的小孩可以坐啊？");
        disneyServiceCenter.dispatchRequest("TicketingProblem", "我在手机上买的票需要兑换吗？");
        disneyServiceCenter.dispatchRequest("NotExistProblem", "我是来闹事的、");
    }
}
