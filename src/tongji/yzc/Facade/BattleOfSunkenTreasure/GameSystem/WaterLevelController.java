package tongji.yzc.Facade.BattleOfSunkenTreasure.GameSystem;

/**
 * 该类是海盗船所在的水流的水位控制器类，它负责检测当前水位情况。
 */
public class WaterLevelController {
    /**
     * 检测当前水位状况。
     * @throws InterruptedException
     */
    public void checkWaterLevel() throws InterruptedException{
        System.out.println(descStr + "checkWaterLevel : 正在检查水位状况...");
        Thread.sleep(1000);
        System.out.println(descStr + "checkWaterLevel : 检查水位完毕.");
    }

    private String descStr = "Screen : (" + this.hashCode() + ") : ";
}
