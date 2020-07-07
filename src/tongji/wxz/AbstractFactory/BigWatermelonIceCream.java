package tongji.wxz.AbstractFactory;

/**
 * 大杯西瓜冰淇淋类
 */
public class BigWatermelonIceCream implements BigIceCream {
    /**
     * 重写接口的taste方法，输出冰淇淋信息
     */
    private String descStr = "BigWatermelonIceCream : (" + this.hashCode() + ") : ";
    @Override
    public void taste() {
        System.out.println(descStr + "taste : 小明尝了尝，果然是大杯西瓜味冰淇淋！");
    }
}
