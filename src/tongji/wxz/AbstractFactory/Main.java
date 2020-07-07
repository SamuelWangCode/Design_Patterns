package tongji.wxz.AbstractFactory;

/**
 * 迪士尼乐园的冰淇淋摊贩提供三种口味两种杯型的冰淇淋，选择你喜欢的吧
 */
public class Main {
    public static void main(String[] args) {
        test();
    }
    public static void test() {
        System.out.println("迪士尼乐园的冰淇淋摊贩提供三种口味两种杯型的冰淇淋，小明口渴了，也想买一根。");
        //创建芒果冰淇淋工厂实例
        IceCreamFactory factory1 = new MangoIceCreamFactory();
        //创建草莓冰淇淋工厂实例
        IceCreamFactory factory2 = new StrawberryIceCreamFactory();
        //创建西瓜冰淇淋工厂实例
        IceCreamFactory factory3 = new WatermelonIceCreamFactory();
        //制作大杯冰淇淋
        BigIceCream iceCream1 = factory1.createBigIceCream();
        //尝尝看
        iceCream1.taste();
        //制作小杯冰淇淋
        SmallIceCream iceCream2 = factory1.createSmallIceCream();
        //尝尝看
        iceCream2.taste();
        //制作大杯冰淇淋
        BigIceCream iceCream3 = factory2.createBigIceCream();
        //尝尝看
        iceCream3.taste();
        //制作小杯冰淇淋
        SmallIceCream iceCream4 = factory2.createSmallIceCream();
        //尝尝看
        iceCream4.taste();
        //制作大杯冰淇淋
        BigIceCream iceCream5 = factory3.createBigIceCream();
        //尝尝看
        iceCream5.taste();
        //制作小杯冰淇淋
        SmallIceCream iceCream6 = factory3.createSmallIceCream();
        //尝尝看
        iceCream6.taste();
    }
}
