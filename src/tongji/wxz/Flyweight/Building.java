package tongji.wxz.Flyweight;

/**
 * 建筑类
 * 该类属于FlyWeight类，种类kind为内部属性，可以共享
 */
public class Building implements BuildingInformation {
    private String descStr = "Building : (" + this.hashCode() + ") : ";
    //种类
    private String kind;
    /**
     * 构造函数
     * @param kind 种类
     */
    public Building(String kind){
        this.kind = kind;
    }
    /**
     * 默认构造函数
     */
    public Building(){
        this("none");
    }
    /**
     * 设置对象的种类
     * @param kind 种类
     */
    public void setKind(String kind){
        this.kind = kind;
    }
    /**
     * 返回对象的种类
     * @return 种类
     */
    public String getKind() {
        return kind;
    }
    /**
     * 重写接口的print()方法，输出建筑的详细信息
     * @param pos 位置
     */
    @Override
    public void print(Position pos) {
        System.out.println(descStr + "print : 建筑类型: " + kind + ",位置: (" + pos.getX() + ", " + pos.getY() + ")。");
    }
}
