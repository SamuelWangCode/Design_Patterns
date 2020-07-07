package tongji.wxz.AbstractFactory;

/**
 * 小杯芒果冰淇淋类
 */
public class SmallMangoIceCream implements SmallIceCream {
    private String descStr = "SmallMangoIceCream : (" + this.hashCode() + ") : ";
    /**
     * 重写接口的taste方法，输出冰淇淋信息
     */
    @Override
    public void taste() {
        System.out.println(descStr + "taste : 小明尝了尝，果然是小杯芒果味冰淇淋！");
    }
}
