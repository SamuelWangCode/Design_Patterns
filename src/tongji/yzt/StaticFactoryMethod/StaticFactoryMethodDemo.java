package tongji.yzt.StaticFactoryMethod;

public class StaticFactoryMethodDemo {
    // 通过统一的工厂，传入不同参数调用生产冰激凌的方法去生产不同口味的冰激凌

    public static void test(){
        System.out.println("欢迎来到迪士尼冰激淋售卖摊！");
        IceCream appleIceCream = IceCreamFactory.creamIceCream("Apple");
        appleIceCream.taste();

        IceCream bananaIceCream = IceCreamFactory.creamIceCream("Banana");
        bananaIceCream.taste();

        IceCream orangeIceCream = IceCreamFactory.creamIceCream("Orange");
        orangeIceCream.taste();
    }
    public static void main(String[] args) {
        //简单工厂模式测试
        test();
    }


}
