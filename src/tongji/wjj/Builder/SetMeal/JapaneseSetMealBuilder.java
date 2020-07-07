package tongji.wjj.Builder.SetMeal;

/**
 * SetMealBuilder的子类，具体的套餐类型。实现了抽象父类中的抽象方法。
 */
public class JapaneseSetMealBuilder extends SetMealBuilder{
    /**
     * 添加主食方法的具体实现。
     */
    @Override
    protected void addStapleFood() {
        disneySetMeal.setStapleFood("寿司");
    }

    /**
     * 添加配菜方法的具体实现。
     */
    @Override
    protected void addSideDish() {
        disneySetMeal.setSideDish("三文鱼刺身");
    }

    /**
     * 添加饮料方法的具体实现。
     */
    @Override
    protected void addDrink() {
        disneySetMeal.setDrink("清酒");
    }

    /**
     * 添加甜点方法的具体实现。
     */
    @Override
    protected void addDessert() {
        disneySetMeal.setDessert("铜锣烧");
    }
}
