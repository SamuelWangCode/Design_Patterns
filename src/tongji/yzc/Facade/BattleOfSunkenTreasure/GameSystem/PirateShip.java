package tongji.yzc.Facade.BattleOfSunkenTreasure.GameSystem;

/**
 * 海盗船类，是游戏子系统中的一个类，它具有音频播放的能力，载客的能力，
 * 还有漂流的能力。
 */
public class PirateShip {

    /**
     * 检查音频装置的良好性。
     * @throws InterruptedException
     */
    public void audioCheck() throws InterruptedException{
        System.out.println(descStr + "audioCheck : 正在检测海盗船上的音频装置...");
        Thread.sleep(1000);
        System.out.println(descStr + "audioCheck : 检测音频装置完毕.");
    }

    /**
     * 使乘客登船。
     * @throws InterruptedException
     */
    public void loadPassengers() throws InterruptedException{
        System.out.println(descStr + "loadPassengers : 顾客正在上船...");
        Thread.sleep(1000);
        System.out.println(descStr + "loadPassengers : 顾客上船完毕.");
    }

    /**
     * 使乘客下船。
     * @throws InterruptedException
     */
    public void unloadPassengers() throws InterruptedException{
        System.out.println(descStr + "loadPassengers : 顾客正在下船...");
        Thread.sleep(1000);
        System.out.println(descStr + "loadPassengers : 顾客下船完毕.");
    }

    /**
     * 检查乘客的安全装置是否完备。
     * @throws InterruptedException
     */
    public void securityCheck() throws InterruptedException {
        System.out.println(descStr + "securityCheck : 正在检查顾客的安全装置...");
        Thread.sleep(1000);
        System.out.println(descStr + "securityCheck : 安全检查完毕.");
    }

    /**
     * 海盗船开始漂流。
     */
    public void startFlow() {
        System.out.println(descStr + "startFlow : 海盗船开始漂流...");
    }

    private String descStr = "PirateShip : (" + this.hashCode() + ") : ";
}
