package tongji.wjj.Builder.SetMeal;

/**
 * 迪士尼餐厅特色套餐的实体类。
 * 每个套餐都有主食、配菜、饮料、甜点四种食物。
 * 套餐制作的Builder会调用四个set方法，来为套餐中添加各种食物。
 * 厨师类可以调用serveSetMeal()方法来上菜。
 */
public class DisneySetMeal {
    private String stapleFood;
    private String sideDish;
    private String drink;
    private String dessert;

    /**
     * 添加主食的方法
     * @param x 主食名
     */
    protected void setStapleFood(String x) {stapleFood = x;}

    /**
     * 添加配菜的方法
     * @param x 配菜名
     */
    protected void setSideDish(String x) {sideDish = x;}

    /**
     * 添加饮料的方法
     * @param x 饮料名
     */
    protected void setDrink(String x) {drink = x;}

    /**
     * 添加甜点的方法
     * @param x 甜点名
     */
    protected void setDessert(String x) {dessert = x;}

    /**
     * 外界可调用的，上菜的方法。
     */
    protected void serveSetMeal() {
        System.out.println("BuilderController : ("+this.hashCode()+") : "+"本套餐的主食为："+stapleFood+"，配菜为："+sideDish+"，饮料为："+drink+"，甜点为："+dessert+"。请享用。");
    }
}
