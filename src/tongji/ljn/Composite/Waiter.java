package tongji.ljn.Composite;


public class Waiter {
    MenuComponent allMenus;

    /**
     * 初始化菜单
     *
     * @param allMenus
     */
    public Waiter(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    /**
     * 打印菜单
     */
    public void printMenu() {
        allMenus.print();
    }

}

