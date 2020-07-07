package tongji.wxz.AbstractFactory;

/**
 * 草莓冰淇淋工厂类
 */
public class StrawberryIceCreamFactory implements IceCreamFactory {
    private String descStr = "StrawberryIceCreamFactory : (" + this.hashCode() + ") : ";
    /**
     * 重写接口的制作大杯冰淇淋方法，生成一个冰淇淋的实例
     * @return InstanceOfBigStrawberryIceCream
     */
    @Override
    public BigIceCream createBigIceCream() {
        System.out.println(descStr + "createBigIceCream : 小明点单：大杯草莓味！");
        return new BigStrawberryIceCream();
    }

    /**
     * 重写接口的制作小杯冰淇淋方法，生成一个冰淇淋的实例
     * @return InstanceOfSmallStrawberryIceCream
     */
    @Override
    public SmallIceCream createSmallIceCream() {
        System.out.println(descStr + "createSmallIceCream : 小明点单：小杯草莓味！");
        return new SmallStrawberryIceCream();
    }
}
