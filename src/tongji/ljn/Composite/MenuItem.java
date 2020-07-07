package tongji.ljn.Composite;

/**
 * MenuItem类继承自抽象基类MenuComponent,为迪士尼乐园餐厅菜单当中的可食用的食物，不再包含子菜单
 * 该类对基类的获取菜名、菜品描述、价格，判断是否是素食的方法进行了重写
 * 相当于该Composite设计模式中的Leaf
 */
public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    boolean vegetarian;
    double price;
    String descStr = "MenuItem("+ this.hashCode()+"):";

    /**
     * 构造函数，初始化菜名、菜品描述、是否素食、价格
     * @param name
     * @param description
     * @param vegetarian
     * @param price
     */
    public MenuItem(String name, String description,
                    boolean vegetarian, double price){
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    /**
     * 重写获得菜名方法
     * @return 菜名
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * 重写获得菜品描述方法
     * @return 菜品描述
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     * 重写判断是否是素食的方法
     * @return 判断结果
     */
    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    /**
     * 重写获得菜品价格的方法
     * @return 价格
     */
    @Override
    public double getPrice(){
        return price;
    }

    public void print(){
        System.out.print(descStr+getName());
        if (isVegetarian()){
            System.out.print("(V)");
        }
        System.out.println("-------------------------$" + getPrice());
        System.out.println("    --"+getDescription());
    }

}
