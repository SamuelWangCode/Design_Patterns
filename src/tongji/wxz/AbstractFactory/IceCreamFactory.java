package tongji.wxz.AbstractFactory;

/**
 * 冰淇淋工厂接口，所有冰淇淋工厂必须实现生产大杯冰淇淋和小杯冰淇淋两个方法
 */
public interface IceCreamFactory {
    BigIceCream createBigIceCream();
    SmallIceCream createSmallIceCream();
}
