package tongji.wxz.FactoryMethod;

/**
 * 米奇英雄类
 */
public class HeroMickey implements Hero {
    private String descStr = "HeroMickey : (" + this.hashCode() + ") : ";
    /**
     * 重写接口中的显示信息方法，输出米奇老鼠的信息
     */
    @Override
    public void showInformation() {
        System.out.println(descStr + "showInformation : 【米奇老鼠】【智力：3】【力量：2】【敏捷：9】");
    }
}
