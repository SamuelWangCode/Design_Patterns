package tongji.wxz.AbstractFactory;

/**
 * 小杯草莓冰淇淋类
 */
public class SmallStrawberryIceCream implements SmallIceCream {
    private String descStr = "SmallStrawberryIceCream : (" + this.hashCode() + ") : ";
    /**
     * 重写接口的taste方法，输出冰淇淋信息
     */
    @Override
    public void taste() {
        System.out.println(descStr + "taste : 小明尝了尝，果然是小杯草莓味冰淇淋！");
    }
}
