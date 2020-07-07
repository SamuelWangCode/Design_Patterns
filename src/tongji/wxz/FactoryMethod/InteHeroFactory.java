package tongji.wxz.FactoryMethod;

/**
 * 智力型英雄工厂，生产唐老鸭英雄
 */
public class InteHeroFactory implements HeroCall {
    private String descStr = "InteHeroFactory : (" + this.hashCode() + ") : ";
    /**
     * 重写HeroCall接口的callHero方法，返回一个唐老鸭的实例
     * @return InstanceOfHeroDonald
     */
    @Override
    public Hero callHero() {
        System.out.println(descStr + "callHero : 小明选择了智力型英雄！");
        return new HeroDonald();
    }
}
