package tongji.ljn.Composite;

/**
 *抽象基类，迪士尼乐园餐厅菜单的基类
 *拥有所有菜单都有的添加、移除菜品，获取菜名、菜品描述、价格、子菜单，判断是否是素食的抽象方法
 *由于菜单中有子菜单，两者有着明显的统一特点，我们可以用Composite来将两者统一看待
 *如果未定义使用则会抛出异常
 *相当于该Composite设计模式中的Component
 */

public abstract class MenuComponent {
    /**
     * 添加菜品的方法
     * @param menuComponent
     * @throws UnsupportedOperationException
     */
    public void add(MenuComponent menuComponent) throws UnsupportedOperationException{
    }

    /**
     * 移除菜品的方法
     * @param menuComponent
     * @throws UnsupportedOperationException
     */
    public void remove(MenuComponent menuComponent) throws UnsupportedOperationException{

    }

    /**
     * 获得菜品名称的方法
     * @return 菜名
     */
    public String getName() {
        throw new UnsupportedOperationException();
    }

    /**
     * 获得菜品描述的方法
     * @return 菜品描述
     */
    public String getDescription() {
        throw new UnsupportedOperationException();
    }


    /**
     * 获得菜品价格的方法
     * @return 菜品价格
     */
    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    /**
     * 获得子菜单的方法
     * @param i
     * @return 子菜单
     */
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    /**
     * 判断是否是素食的方法
     * @return 判断结果
     */
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

}
