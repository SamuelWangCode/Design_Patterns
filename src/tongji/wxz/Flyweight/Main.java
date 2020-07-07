package tongji.wxz.Flyweight;

/**
 * 迪士尼乐园的游乐设施五花八门呢，如果每一种设施都创建一个新的对象真的是好大一笔开销呢！！
 * 如果把游乐设施按类别区分开，再通过工厂使相同类型的游乐设施共用一个对象就好了呢，
 * 通过享元实现了以上方法。
 */
public class Main {
    public static void main(String[] args) {
        test();
    }
    public static void test() {
        System.out.println("迪士尼的建筑设计师开始设计游乐园的规划了，他想在游乐园放两个过山车和一个旋转木马。");
        //创建工厂的实例
        BuildingFactory factory = BuildingFactory.getInstance();
        //生产一个游乐设施
        Building building1 = factory.get("过山车");
        //将游乐设施放置在一个明确的位置，并输出详细信息
        building1.print(new Position(4,2));
        //查看对象池中的对象数
        factory.getSize();
        //生产一个游乐设施
        Building building2 = factory.get("过山车");
        //将游乐设施放置在一个明确的位置，并输出详细信息
        building1.print(new Position(2,5));
        //查看对象池中的对象数
        factory.getSize();
        //生产一个游乐设施
        Building building3 = factory.get("旋转木马");
        //将游乐设施放置在一个明确的位置，并输出详细信息
        building3.print(new Position(5,8));
        //查看对象池中的对象数
        factory.getSize();
    }
}
