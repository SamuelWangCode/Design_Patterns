package tongji.yzt.StaticFactoryMethod;

public class AppleIceCream implements IceCream {

    public void taste(){
        System.out.println("AppleIceCream：("+this.hashCode()+"):taste:请拿好,这是苹果口味的冰激凌");
    }
}
