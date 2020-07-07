package tongji.wxz.FactoryMethod;

/**
 * 高飞英雄类
 */
public class HeroGoofy implements Hero {
    private String descStr = "HeroGoofy : (" + this.hashCode() + ") : ";
    /**
     * 重写接口中的显示信息方法，输出高飞·普鲁托的信息
     */
    @Override
    public void showInformation() {
        System.out.println(descStr + "showInformation : 【高飞·普鲁托】【智力：1】【力量：10】【敏捷：3】");
    }
}
