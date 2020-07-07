package tongji.wxz.Flyweight;

/**
 * 建筑信息的接口，所有建筑类必须实现该接口的print()方法
 */
public interface BuildingInformation {
    /**
     * 输出建筑的具体信息
     * @param pos 位置
     */
    void print(Position pos);
}
