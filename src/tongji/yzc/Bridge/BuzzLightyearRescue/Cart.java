package tongji.yzc.Bridge.BuzzLightyearRescue;

import tongji.yzc.Bridge.BuzzLightyearRescue.ToyGun.Shotable;
import tongji.yzc.Bridge.BuzzLightyearRescue.ToyGun.ToyLaserGun;

/**
 * 巴斯光年营救矿车
 * 抽象类，是Bridge模式中的抽象部分。
 * 矿车是一个与枪无关的独立变化维度，它有自己的开车方式，
 * 剧情内容，与枪如何射击无关。
 * 本抽象类中定义了每个营救矿车含有三把枪，并且定义了
 * 抽象方法start，需要子类实现自己的开车方式。
 */
public abstract class Cart {
    protected Shotable leftGun;
    protected Shotable middleGun;
    protected Shotable rightGun;

    /**
     * 所有营救矿车的构造函数，需要提供三把枪。
     * @param leftGun
     * @param middleGun
     * @param rightGun
     */
    protected Cart(Shotable leftGun, Shotable middleGun, Shotable rightGun){
        this.leftGun = leftGun;
        this.middleGun = middleGun;
        this.rightGun = rightGun;
    }

    /**
     * 抽象的方法，意义是开车，需要子类去实现自己的开车逻辑，
     * 遇到哪些敌人等等。
     * @throws InterruptedException
     */
    abstract public void start() throws InterruptedException;

    private String descStr = "Cart : (" + this.hashCode() + ") : ";
}
