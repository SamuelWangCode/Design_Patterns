package tongji.wxz.AbstractFactory;

/**
 * 大杯草莓冰淇淋类
 */
public class BigStrawberryIceCream implements BigIceCream {
    /**
     * 重写接口的taste方法，输出冰淇淋信息
     */
    private String descStr = "BigStrawberryIceCream : (" + this.hashCode() + ") : ";
    @Override
    public void taste() {
        System.out.println(descStr + "taste : 小明尝了尝，果然是大杯草莓味冰淇淋！");
    }
}
