package tongji.ljn.Composite;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * Menu类继承自抽象基类MenuComponent，为迪士尼乐园餐厅中的菜单的真正的类
 * 维护了一个MenuComponent的ArrayList
 * 由于Menu和MenuItem都是继承自MenuComponent,遂ArrayList中即可接受Menu，也可以接受MenuItem
 * 相当于该Composite设计模式中的Composite
 */
public class Menu extends MenuComponent {
    ArrayList<MenuComponent> menuComponentArrayList = new ArrayList<MenuComponent>();
    String name;
    String description;
    String descStr = "Menu("+this.hashCode()+"):";

    /**
     * 构造函数
     * @param name
     * @param description
     */
    public Menu(String name,String description){
        this.name = name;

    }

    /**
     * 重写获得菜名方法
     * @return 菜名
     */
    @Override
    public String getName()
    {
        return name;
    }

    /**
     * 重写获得菜品描述方法
     * @return 菜品描述
     */
    @Override
    public String getDescription(){
        return description;
    }

    /**
     * 重写增加菜品方法
     * @param menuComponent
     */
    @Override
    public void add(MenuComponent menuComponent){
        menuComponentArrayList.add(menuComponent);
    }

    /**
     * 重写移除菜品方法
     * @param menuComponent
     */
    @Override
    public void remove(MenuComponent menuComponent){
        menuComponentArrayList.remove(menuComponent);
    }

    /**
     * 重写获取子菜单/菜方法
     * @param i
     * @return Menu/MenuItem
     */
    @Override
    public MenuComponent getChild(int i){
        return (MenuComponent)menuComponentArrayList.get(i);
    }

    public void print() {
        System.out.print("\n" + getName());
        System.out.println(this.descStr+"：" + getDescription());
        System.out.println("---------------------------------------------------");

        Iterator<MenuComponent> iterator = menuComponentArrayList.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }

}
