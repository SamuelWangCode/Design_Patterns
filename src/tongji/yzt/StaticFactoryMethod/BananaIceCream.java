package tongji.yzt.StaticFactoryMethod;

public class BananaIceCream implements IceCream {

    public void taste() {
        System.out.println("BananaIceCream：("+this.hashCode()+"):taste:请拿好,这是香蕉口味的冰激凌");
    }
}
