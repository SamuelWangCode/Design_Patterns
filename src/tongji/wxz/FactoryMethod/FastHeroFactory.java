package tongji.wxz.FactoryMethod;

/**
 * 敏捷型英雄工厂，生产米奇老鼠英雄
 */
public class FastHeroFactory implements HeroCall {
    private String descStr = "FastHeroFactory : (" + this.hashCode() + ") : ";
    /**
     * 重写HeroCall接口的callHero方法，返回一个米奇老鼠的实例
     * @return InstanceOfHeroMickey
     */
    @Override
    public Hero callHero() {
        System.out.println(descStr + "callHero : 小明选择了敏捷型英雄！");
        return new HeroMickey();
    }
}
