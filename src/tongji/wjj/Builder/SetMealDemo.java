package tongji.wjj.Builder;

import tongji.wjj.Builder.SetMeal.DisneySetMeal;
import tongji.wjj.Builder.SetMeal.SetMealCook;

import java.util.Arrays;

public class SetMealDemo {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        System.out.println("Builder设计模式测试 作者：魏敬杰");
        System.out.println("欢迎来到迪士尼特色套餐餐厅！");
        SetMealCook cook = new SetMealCook();
        try {
            cook.serve();
        } catch (InterruptedException e) {
            System.out.println("BuilderController : 因为一个预期之外的错误，点餐出现了问题。");
        }
    }
}
