package tongji.ljn.Composite;

public class MenuDemo {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        System.out.println("欢迎来到迪士尼乐园星露台餐厅，菜单如下：");

        MenuComponent stargazerGrillMenu = new Menu("星露台餐厅","有落地窗的室内美食餐厅，是明日世界园区的主要就餐场所");
        MenuComponent mealSet = new Menu("套餐","包含主食、饮料、小食，建议一人食用");
        MenuComponent kidSet = new Menu("儿童套餐","仅适合10岁及以下儿童");
        MenuComponent drinks = new Menu("饮料","享受畅饮时刻");

        stargazerGrillMenu.add(mealSet);
        stargazerGrillMenu.add(kidSet);
        stargazerGrillMenu.add(drinks);

        mealSet.add(new MenuItem(
                "星露台家庭盛宴",
                "美味要和家人分享哦~（建议4人食用）",
                false,
                288
        ));
        mealSet.add(new MenuItem(
                "星露台烤牛排",
                "精选神户牛排",
                false,
                98
        ));
        mealSet.add(new MenuItem(
                "芝士牛肉汉堡",
                "肉质香嫩可口",
                false,
                98
        ));
        mealSet.add(new MenuItem(
                "韩式猪排汉堡",
                "来自苏格兰的乳猪肉不容错过呀",
                false,
                85
        ));
        mealSet.add(new MenuItem(
                "麻辣鸡肉汉堡",
                "吃过的都说好",
                false,
                78
        ));

        kidSet.add(new MenuItem(
                "扒鸡柳儿童餐",
                "精选无骨鸡胸肉，小朋友们的最爱",
                false,
                48
        ));
        kidSet.add(new MenuItem(
                "香脆鱼柳儿童餐",
                "原产深海的鳕鱼，富含营养",
                false,
                48
        ));

        drinks.add(new MenuItem(
                "各式饮料",
                "可乐、芬达、雪碧、七喜、冰红茶,450ml",
                true,
                15
        ));
        drinks.add(new MenuItem(
                "咖啡",
                "精选产自危地马拉咖啡豆现磨而成,350ml",
                true,
                15
        ));
        drinks.add(new MenuItem(
                "焦糖咖啡热巧克力",
                "暖暖的，很贴心,350ml",
                true,
                35
        ));
        drinks.add(new MenuItem(
                "香橙蜂蜜柚子",
                "美容养颜，350ml",
                true,
                20
        ));


        Waiter waiter = new Waiter(stargazerGrillMenu);

        waiter.printMenu();


    }
}
