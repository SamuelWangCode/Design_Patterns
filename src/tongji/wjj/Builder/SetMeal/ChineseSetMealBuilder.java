package tongji.wjj.Builder.SetMeal;

/**
 * SetMealBuilder的子类，具体的套餐类型。实现了抽象父类中的抽象方法。
 */
public class ChineseSetMealBuilder extends SetMealBuilder {
    /**
     * 添加主食方法的具体实现。
     */
    @Override
    protected void addStapleFood(){
        disneySetMeal.setStapleFood("米饭");
    }

    /**
     * 添加配菜方法的具体实现。
     */
    @Override
    protected void addSideDish() {
        disneySetMeal.setSideDish("红烧肉");
    }

    /**
     * 添加饮料方法的具体实现。
     */
    @Override
    protected void addDrink() {
        disneySetMeal.setDrink("绿茶");
    }

    /**
     * 添加甜点方法的具体实现。
     */
    @Override
    protected void addDessert() {
        disneySetMeal.setDessert("凉糕");
    }
}
