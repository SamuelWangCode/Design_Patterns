package tongji.wxz.FactoryMethod;

/**
 * 迪士尼乐园的一个英雄角色扮演小游戏，你可以选择力量型、敏捷型或智力型英雄，进行战斗
 */
public class Main {
    public static void main(String[] args) {
        test();
    }
    public static void test() {
        System.out.println("这是迪士尼乐园的一个英雄角色扮演小游戏，小明可以选择力量型、敏捷型或智力型英雄，进行战斗");
        //实例化敏捷型英雄工厂
        HeroCall heroFactory1 = new FastHeroFactory();
        //召唤英雄
        Hero hero1 = heroFactory1.callHero();
        //英雄资料
        hero1.showInformation();
        //实例化力量型英雄工厂
        HeroCall heroFactory2 = new StroHeroFactory();
        //召唤英雄
        Hero hero2 = heroFactory2.callHero();
        //英雄资料
        hero2.showInformation();
        //实例化智力型英雄工厂
        HeroCall heroFactory3 = new InteHeroFactory();
        //召唤英雄
        Hero hero3 = heroFactory3.callHero();
        //英雄资料
        hero3.showInformation();
    }
}
