package tongji.zyd.Strategy;

import tongji.zyd.Strategy.Parade.Strategy.ChristmasParadeStrategy;
import tongji.zyd.Strategy.Parade.Parade;
import tongji.zyd.Strategy.Parade.Strategy.HalloweenParadeStrategy;
import tongji.zyd.Strategy.Parade.Strategy.ParadeStrategy;

public class TestParade {
    public static void main(String[] argv){
        test();
    }
    public static void test(){
        System.out.println("欢迎参与迪士尼巡游活动");
        Parade parade=new Parade(null);
        System.out.println("巡游0:未设置巡游方案");
        test_unit(parade,null);
        System.out.println("巡游1:进行万圣节巡游");
        test_unit(parade, HalloweenParadeStrategy.getInstance());
        System.out.println("巡游2:进行圣诞节巡游");
        test_unit(parade, ChristmasParadeStrategy.getInstance());
    }
    static void test_unit(Parade parade, ParadeStrategy strategy){
        try {
            parade.setStrategy(strategy);
            parade.show();
        } catch (InterruptedException ex) {
            System.out.println("巡游出现问题，巡游中止");
        }
    }

}
