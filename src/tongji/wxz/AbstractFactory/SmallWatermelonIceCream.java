package tongji.wxz.AbstractFactory;

/**
 * 小杯西瓜冰淇淋类
 */
public class SmallWatermelonIceCream implements SmallIceCream {
    private String descStr = "SmallWatermelonIceCream : (" + this.hashCode() + ") : ";
    /**
     * 重写接口的taste方法，输出冰淇淋信息
     */
    @Override
    public void taste() {
        System.out.println(descStr + "taste : 小明尝了尝，果然是小杯西瓜味冰淇淋！");
    }
}
