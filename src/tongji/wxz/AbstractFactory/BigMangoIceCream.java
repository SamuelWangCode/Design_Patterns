package tongji.wxz.AbstractFactory;

/**
 * 大杯芒果冰淇淋类
 */
public class BigMangoIceCream implements BigIceCream {
    /**
     * 重写接口的taste方法，输出冰淇淋信息
     */
    private String descStr = "BigMangoIceCream : (" + this.hashCode() + ") : ";
    @Override
    public void taste() {
        System.out.println(descStr + "taste : 小明尝了尝，果然是大杯芒果味冰淇淋！");
    }
}
