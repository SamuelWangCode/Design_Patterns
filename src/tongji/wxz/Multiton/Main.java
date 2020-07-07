package tongji.wxz.Multiton;

/**
 * 迪士尼乐园有一个选择公主的游戏，选择一个你喜欢的公主，她会说出台词
 * 为了避免生成其他实例，我们给定了三个可实例化的公主，只能通过getInstance()方法获取实例
 */

public class Main {
    public static void main(String[] args) {
        test();
    }
    public static void test() {
        System.out.println("迪士尼乐园有一个选择公主的游戏，选择一个你喜欢的公主，她会说出台词，小明开心地玩了起来。");
        //生成白雪公主实例
        Princess snowWhite = Princess.getInstance(Choose.SNOW_WHITE);
        //输出信息
        assert snowWhite != null;
        snowWhite.printWords();
        //生成白雪公主实例
        Princess cinderella = Princess.getInstance(Choose.CINDERELLA);
        //输出信息
        assert cinderella != null;
        cinderella.printWords();
        //生成白雪公主实例
        Princess mermaid = Princess.getInstance(Choose.MERMAID);
        //输出信息
        assert mermaid != null;
        mermaid.printWords();
    }
}
