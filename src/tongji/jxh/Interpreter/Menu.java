package tongji.jxh.Interpreter;
import java.util.HashMap;
import java.util.Map;

// Serve as the context to interpret
public class Menu {
    private Map<String,Integer> dishList=new HashMap<>();
    private String prefix = "Menu (" + this.hashCode()+") : ";

    public Menu(){};

    public void addDishItem(Dish dish,Integer value){
        dishList.put(dish.name,value);
    }

    public int getValue(String dish)throws InterruptedException{
        int value=dishList.get(dish);
        System.out.println(prefix+"getValue: The "+dish+"is $"+value+".");
        Thread.sleep(1000);
        return value;
    }
}
