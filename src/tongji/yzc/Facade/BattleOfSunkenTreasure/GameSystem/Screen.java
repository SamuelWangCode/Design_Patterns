package tongji.yzc.Facade.BattleOfSunkenTreasure.GameSystem;

/**
 * 游戏子系统中的一个类，代表了乘客们坐船时看到的大屏幕。
 */
public class Screen {
    /**
     * 检查屏幕的可用性。
     * @throws InterruptedException
     */
    public void checkAvailability() throws InterruptedException{
        System.out.println(descStr + "checkAvailability : 正在检查屏幕可用性...");
        Thread.sleep(1000);
        System.out.println(descStr + "checkAvailability : 可用性检查完毕.");
    }

    /**
     * 播放视频。
     */
    public void playVideo() {
        System.out.println(descStr + "playVideo : 开始播放视频...");
    }

    private String descStr = "Screen : (" + this.hashCode() + ") : ";
}
