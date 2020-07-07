package tongji.wjj.Builder.SetMeal;

import java.util.Scanner;

/**
 * 迪士尼餐厅的厨师类。包含了从点单到制作到上菜的一系列操作。
 * 对外界提供了serve()接口。外界在创建一个厨师类实例后，通过调用serve()方法即可完成完整的套餐点餐到享用的过程。
 */
public class SetMealCook {
    private SetMealBuilder setMealBuilder;

    /**
     * 顾客点餐选择套餐种类的方法。从Chinese, Japanese, Western三种套餐中选择一种。
     * 在顾客完成选择后，根据顾客选择的套餐类型来创建builder。
     * @throws InterruptedException
     */
    private void setMealKind() throws InterruptedException {
        System.out.println("BuilderController : ("+this.hashCode()+") : "+"请输入要选择的套餐种类：Chinese/Japanese/Western:");
        Scanner s = new Scanner(System.in);
        String kind = s.nextLine();
        while(!kind.equals("Chinese")&&!kind.equals("Japanese")&&!kind.equals("Western")) {
            System.out.println("BuilderController : ("+this.hashCode()+") : "+"没有这种类型的套餐，请输入已有套餐类型:");
            kind = s.nextLine();
        }
        if(kind.equals("Chinese")) setMealBuilder = new ChineseSetMealBuilder();
        else if(kind.equals("Japanese")) setMealBuilder = new JapaneseSetMealBuilder();
        else if(kind.equals("Western")) setMealBuilder = new WesternSetMealBuilder();
        Thread.sleep(500);
        System.out.println("BuilderController : ("+this.hashCode()+") : "+"你选择的套餐类型是："+kind);
        Thread.sleep(500);
    }

    /**
     * 厨师类与外界的服务接口。也是就餐过程的框架。外界通过调用此方法来进行一次完整的就餐过程。
     * 该方法调用完setMealKind()方法，完成点菜后调用builder的方法来进行制作。随后调用套餐实体类的serve方法来将其端上。
     * @throws InterruptedException
     */
    public void serve() throws InterruptedException {
        setMealKind();
        Thread.sleep(500);
        setMealBuilder.cookMeal();
        Thread.sleep(500);
        setMealBuilder.disneySetMeal.serveSetMeal();
    }
}
