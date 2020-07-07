package tongji.wxz.FactoryMethod;

/**
 * 英雄工厂的接口，所有工厂必须实现接口中的召唤英雄方法
 */
public interface HeroCall {
    Hero callHero();
}
