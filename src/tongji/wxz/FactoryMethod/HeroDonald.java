package tongji.wxz.FactoryMethod;

/**
 * 唐老鸭英雄类
 */
public class HeroDonald implements Hero {
    private String descStr = "HeroDonald : (" + this.hashCode() + ") : ";
    /**
     * 重写接口中的显示信息方法，输出唐老鸭的信息
     */
    @Override
    public void showInformation() {
        System.out.println(descStr + "showInformation : 【唐老鸭】【智力：8】【力量：2】【敏捷：4】");
    }
}
