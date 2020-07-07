package tongji.yzc.Bridge.BuzzLightyearRescue;

import tongji.yzc.Bridge.BuzzLightyearRescue.ToyGun.Shotable;
import tongji.yzc.Bridge.BuzzLightyearRescue.ToyGun.ToyLaserGun;
import tongji.yzc.Bridge.BuzzLightyearRescue.ToyGun.ToyShotGun;

/**
 * 扩展抽象类，是Cart类的子类，实现了自己的开车逻辑，
 * 剧情内容等等。它的内部使用了ToyGun包中的各种
 * 玩具枪，但是不需要了解它们是如何开枪的，
 * 即可用它们来设计敌人。
 */
public class FightZombieCart extends Cart {

    /**
     * 构造函数，调用Cart父类中的构造函数即可。
     * @param leftGun
     * @param middleGun
     * @param rightGun
     */
    public FightZombieCart(Shotable leftGun, Shotable middleGun, Shotable rightGun) {
        super(leftGun, middleGun, rightGun);
    }

    /**
     * 实现的父类的抽象方法，定义了打击僵尸的剧情内容，
     * 并且在不知道枪支如何实现开枪的情况下使用到了玩具枪支。
     * 降低了各类之间的耦合度。
     * @throws InterruptedException
     */
    @Override
    public void start() throws InterruptedException{
        System.out.println(descStr + "start : 开始打击僵尸游戏...");
        Thread.sleep(1000);
        System.out.println(descStr + "start : 遇到僵尸：鲍勃...");
        Thread.sleep(1000);
        leftGun.shot("鲍勃");
        middleGun.shot("鲍勃");
        rightGun.shot("鲍勃");
        Thread.sleep(1000);
        System.out.println(descStr + "start : 僵尸：鲍勃 去世");
        Thread.sleep(1000);
        System.out.println(descStr + "start : 遇到僵尸：小可爱...");
        Thread.sleep(1000);
        leftGun.shot("小可爱");
        middleGun.shot("小可爱");
        Thread.sleep(1000);
        System.out.println(descStr + "start : 僵尸：小可爱 去世");
        Thread.sleep(1000);
        System.out.println(descStr + "start : 打击僵尸游戏结束");
    }

    private String descStr = "FightZombieCart : (" + this.hashCode() + ") : ";
}
