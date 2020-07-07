package tongji.yzt.StaticFactoryMethod;

public class OrangeIceCream implements IceCream{

    public void taste(){
        System.out.println("OrangeIceCream：("+this.hashCode()+"):taste:请拿好,这是橘子口味的冰激凌");
    }
}