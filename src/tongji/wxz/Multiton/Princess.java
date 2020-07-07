package tongji.wxz.Multiton;

/**
 * 公主类，实现了多例模式
 */
public class Princess {
    private static String descStr = "(static)Princess : ";
    //公主的台词
    private String words;
    /**
     * 私有的构造函数
     * @param words 台词
     */
    private Princess(String words){
        this.words = words;
    }
    private Princess(){
        this("哑巴");
    }
    /**
     * 定义有限个可实例化对象
     */
    private static Princess snowWhite = new Princess("我是白雪公主，我爱吃苹果。");
    private static Princess cinderella = new Princess("我是灰姑娘，我爱穿高跟鞋。");
    private static Princess mermaid = new Princess("我是美人鱼，我爱跑步。");
    /**
     * 获取实例的方法
     * @param choose 选择
     * @return 公主的实例
     */
    public static Princess getInstance(int choose) {
        switch (choose){
            case Choose.SNOW_WHITE:{
                System.out.println(Princess.descStr + "getInstance : 小明选择了白雪公主。");
                return snowWhite;
            }
            case Choose.CINDERELLA:{
                System.out.println(Princess.descStr + "getInstance : 小明选择了灰姑娘。");
                return cinderella;
            }
            case Choose.MERMAID:{
                System.out.println(Princess.descStr + "getInstance : 小明选择了美人鱼公主。");
                return mermaid;
            }
            default :{
                return null;
            }
        }
    }
    /**
     * 输出公主的信息
     */
    public void printWords(){
        System.out.println(Princess.descStr + "printWords : " + words);
    }
}
