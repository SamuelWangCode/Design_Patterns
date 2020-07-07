package tongji.wjj.Builder.SetMeal;

/**
 * SetMealBuilder的子类，具体的套餐类型。实现了抽象父类中的抽象方法。
 */
public class WesternSetMealBuilder extends SetMealBuilder {

    /**
     * 添加主食方法的具体实现
     */
    @Override
    protected void addStapleFood() {
        disneySetMeal.setStapleFood("意大利面");
    }

    /**
     * 添加配菜方法的具体实现
     */
    @Override
    protected void addSideDish() {
        disneySetMeal.setSideDish("牛排");
    }

    /**
     * 添加饮料方法的具体实现
     */
    @Override
    protected void addDrink() {
        disneySetMeal.setDrink("可乐");
    }

    /**
     * 添加甜点方法的具体实现
     */
    @Override
    protected void addDessert() {
        disneySetMeal.setDessert("蔬菜沙拉");
    }
}
