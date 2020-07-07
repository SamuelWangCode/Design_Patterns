package tongji.wjj.Builder.SetMeal;

/**
 * 创建套餐的Builder，是一个抽象类。每一个具体套餐的Builder都要继承它。
 * 其中定义了每个套餐都要经历的框架活动：创建新套餐实例，添加主食、配菜、饮料和甜点。
 * 厨师类SetMealCook通过调用算法骨架cookMeal()方法来完成整个套餐的制作过程。
 */
public abstract class SetMealBuilder {
    protected DisneySetMeal disneySetMeal;

    /**
     * cookMeal()方法，Builder算法的骨架，包括了所有套餐制作都要经历的普适性过程。
     * 即新建套餐实例、依次添加四种食物。
     * @throws InterruptedException
     */
    protected void cookMeal() throws InterruptedException {
        System.out.println("BuilderController : ("+this.hashCode()+") : "+"正在创建新套餐...");
        Thread.sleep(1000);
        createNewMeal();
        System.out.println("BuilderController : ("+this.hashCode()+") : "+"正在添加主食...");
        Thread.sleep(1000);
        addStapleFood();
        System.out.println("BuilderController : ("+this.hashCode()+") : "+"正在添加配菜...");
        Thread.sleep(1000);
        addSideDish();
        System.out.println("BuilderController : ("+this.hashCode()+") : "+"正在添加饮料...");
        Thread.sleep(1000);
        addDrink();
        System.out.println("BuilderController : ("+this.hashCode()+") : "+"正在添加甜点...");
        Thread.sleep(1000);
        addDessert();
        System.out.println("BuilderController : ("+this.hashCode()+") : "+"套餐制作完毕！");
    }

    /**
     * 创建新套餐实例的方法。
     */
    protected void createNewMeal() {
        disneySetMeal = new DisneySetMeal();
    }

    /**
     * 添加主食，因为没有具体的套餐类型，故只是抽象方法，留待子类实现。
     */
    protected abstract void addStapleFood();

    /**
     * 添加配菜，因为没有具体的套餐类型，故只是抽象方法，留待子类实现。
     */
    protected abstract void addSideDish();

    /**
     * 添加饮料，因为没有具体的套餐类型，故只是抽象方法，留待子类实现。
     */
    protected abstract void addDrink();

    /**
     * 添加甜点，因为没有具体的套餐类型，故只是抽象方法，留待子类实现。
     */
    protected abstract void addDessert();
}
