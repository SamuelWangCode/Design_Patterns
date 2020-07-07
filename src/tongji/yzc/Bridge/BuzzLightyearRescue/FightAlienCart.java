package tongji.yzc.Bridge.BuzzLightyearRescue;

import tongji.yzc.Bridge.BuzzLightyearRescue.ToyGun.Shotable;
import tongji.yzc.Bridge.BuzzLightyearRescue.ToyGun.ToyLaserGun;
import tongji.yzc.Bridge.BuzzLightyearRescue.ToyGun.ToyShotGun;

/**
 * 扩展抽象类，是Cart类的子类，实现了自己的开车逻辑，
 * 剧情内容等等。它的内部使用了ToyGun包中的各种
 * 玩具枪，但是不需要了解它们是如何开枪的，
 * 即可用它们来射击敌人。
 */
public class FightAlienCart extends Cart{

    /**
     * 构造函数，调用Cart父类中的构造函数即可。
     * @param leftGun
     * @param middleGun
     * @param rightGun
     */
    public FightAlienCart(Shotable leftGun, Shotable middleGun, Shotable rightGun) {
        super(leftGun, middleGun, rightGun);
    }

    /**
     * 实现的父类的抽象方法，定义了打击外星人的剧情内容，
     * 并且在不知道枪支如何实现开枪的情况下使用到了玩具枪支。
     * 降低了各类之间的耦合度。
     * @throws InterruptedException
     */
    @Override
    public void start() throws InterruptedException{
        System.out.println(descStr + "start : 开始打击外星人游戏...");
        Thread.sleep(1000);
        System.out.println(descStr + "start : 遇到外星人：血厚怪...");
        Thread.sleep(1000);
        leftGun.shot("血厚怪");
        middleGun.shot("血厚怪");
        rightGun.shot("血厚怪");
        leftGun.shot("血厚怪");
        middleGun.shot("血厚怪");
        rightGun.shot("血厚怪");
        leftGun.shot("血厚怪");
        middleGun.shot("血厚怪");
        rightGun.shot("血厚怪");
        Thread.sleep(1000);
        System.out.println(descStr + "start : 外星人：血厚怪 去世");
        Thread.sleep(1000);
        System.out.println(descStr + "start : 遇到外星人：血薄怪...");
        Thread.sleep(1000);
        leftGun.shot("血薄怪");
        Thread.sleep(1000);
        System.out.println(descStr + "start : 僵尸：血薄怪 去世");
        Thread.sleep(1000);
        System.out.println(descStr + "start : 打击僵尸游戏结束");
    }

    private String descStr = "FightZombieCart : (" + this.hashCode() + ") : ";
}
