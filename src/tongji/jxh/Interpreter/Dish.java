package tongji.jxh.Interpreter;

public class Dish implements Expression {
    String name;
    public Dish(String name){
        this.name=name;
    }

    @Override
    public int interpret(Menu menu)throws InterruptedException {
        return menu.getValue(name);
    }
}
