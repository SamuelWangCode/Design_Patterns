package tongji.wxz.FactoryMethod;

/**
 * 力量型英雄工厂，生产高飞·普鲁托英雄
 */
public class StroHeroFactory implements HeroCall {
    private String descStr = "StroHeroFactory : (" + this.hashCode() + ") : ";
    /**
     * 重写HeroCall接口的callHero方法，返回一个高飞的实例
     * @return InstanceOfHeroGoofy
     */
    @Override
    public Hero callHero() {
        System.out.println(descStr + "callHero : 小明选择了力量型英雄！");
        return new HeroGoofy();
    }
}
