package tongji.jxh.Interpreter;

public class InterpreterDemo {
    public static void main(String[] args) {
        try {
            test();
        }
        catch (InterruptedException e){
            System.out.println("Main: main: Order is canceled...");
        }
    }

    public static void test()throws InterruptedException{
        System.out.println("开始测试Interpreter 作者：江宵汉");
        System.out.println("Main : Royal Banquet Hall : Welcome! Feast here!");
        Thread.sleep(500);

        Menu menu=new Menu();

        Dish royalSalad=new Dish("Royal Salad");
        Dish chickenParmigiana=new Dish("Chicken Parmigiana");
        Dish fruitPlatter=new Dish("Fruit Platter");

        menu.addDishItem(royalSalad,6);
        menu.addDishItem(chickenParmigiana,8);
        menu.addDishItem(fruitPlatter,3);

        System.out.println(String.format("Main : customer : I'd like %s, %s and %s, please.",royalSalad.name,chickenParmigiana.name,fruitPlatter.name));
        Thread.sleep(500);

        Expression order=new AndOperation(new CommaOperation(royalSalad,chickenParmigiana),fruitPlatter);

        System.out.println("Main : waiter : Let me see...the bill is total up to $"+order.interpret(menu)+".");
    }
}
