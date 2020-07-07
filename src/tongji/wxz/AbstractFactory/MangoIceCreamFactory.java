package tongji.wxz.AbstractFactory;

/**
 * 芒果冰淇淋工厂类
 */
public class MangoIceCreamFactory implements IceCreamFactory {
    private String descStr = "MangoIceCreamFactory : (" + this.hashCode() + ") : ";
    /**
     * 重写接口的制作大杯冰淇淋方法，生成一个冰淇淋的实例
     * @return InstanceOfBigMangoIceCream
     */
    @Override
    public BigIceCream createBigIceCream() {
        System.out.println(descStr + "createBigIceCream : 小明点单：大杯芒果味！");
        return new BigMangoIceCream();
    }

    /**
     * 重写接口的制作小杯冰淇淋方法，生成一个冰淇淋的实例
     * @return InstanceOfSmallMangoIceCream
     */
    @Override
    public SmallIceCream createSmallIceCream() {
        System.out.println(descStr + "createSmallIceCream : 小明点单：小杯芒果味！");
        return new SmallMangoIceCream();
    }
}
