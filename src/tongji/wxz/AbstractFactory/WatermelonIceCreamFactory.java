package tongji.wxz.AbstractFactory;

/**
 * 西瓜冰淇淋工厂类
 */
public class WatermelonIceCreamFactory implements IceCreamFactory {
    private String descStr = "WatermelonIceCreamFactory : (" + this.hashCode() + ") : ";
    /**
     * 重写接口的制作大杯冰淇淋方法，生成一个冰淇淋的实例
     * @return InstanceOfBigWatermelonIceCream
     */
    @Override
    public BigIceCream createBigIceCream() {
        System.out.println(descStr + "createBigIceCream : 小明点单：大杯西瓜味！");
        return new BigWatermelonIceCream();
    }

    /**
     * 重写接口的制作大杯冰淇淋方法，生成一个冰淇淋的实例
     * @return InstanceOfSmallWatermelonIceCream
     */
    @Override
    public SmallIceCream createSmallIceCream() {
        System.out.println(descStr + "createSmallIceCream : 小明点单：小杯西瓜味！");
        return new SmallWatermelonIceCream();
    }
}
