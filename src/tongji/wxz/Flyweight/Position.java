package tongji.wxz.Flyweight;

/**
 * 外部状态：位置类
 * 这个类决定了游乐设施的位置，属于外部状态，不能被共享
 */
public class Position {
    private int x;
    private int y;
    /**
     * 构造函数
     * @param x 横坐标
     * @param y 纵坐标
     */
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }
    /**
     * 默认构造函数
     */
    public Position(){
        this(0,0);
    }
    /**
     * 设置横坐标
     * @param x 横坐标
     */
    public void setX(int x) {
        this.x = x;
    }
    /**
     * 设置纵坐标
     * @param y 纵坐标
     */
    public void setY(int y) {
        this.y = y;
    }
    /**
     * 返回横坐标
     * @return 横坐标
     */
    public int getX() {
        return x;
    }
    /**
     * 返回纵坐标
     * @return 纵坐标
     */
    public int getY() {
        return y;
    }
}
