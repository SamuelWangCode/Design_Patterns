package tongji.yzc.Bridge.BuzzLightyearRescue.ToyGun;

/**
 * Bridge模式中的桥梁
 * ToyGun接口。
 * 它是 游戏矿车中使用的枪 与 实际实现的枪的桥梁
 * 枪支这一维度与矿车无关，所以可以这么设计
 * 并且这么做使得耦合度较低。
 */
public interface Shotable {
    void shot(String enemy);
}
