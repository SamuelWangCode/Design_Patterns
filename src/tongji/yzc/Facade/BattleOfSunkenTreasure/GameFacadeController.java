package tongji.yzc.Facade.BattleOfSunkenTreasure;

import tongji.yzc.Facade.BattleOfSunkenTreasure.GameSystem.PirateShip;
import tongji.yzc.Facade.BattleOfSunkenTreasure.GameSystem.Screen;
import tongji.yzc.Facade.BattleOfSunkenTreasure.GameSystem.WaterLevelController;

/**
 * Facade模式中的门面类，它是整个游戏子系统的门面类，
 * 相当于一个游戏的控制器，只需要调用它的startGame，即可完成系统内部复杂的调用，
 * 降低了访问复杂系统的内部子系统时的复杂度，简化客户端与之的接口。
 * 工作人员可以简化控制流程。减少了系统间的相互依赖，简化了流程。
 */
public class GameFacadeController {
    private PirateShip pirateShip = new PirateShip();
    private Screen screen = new Screen();
    private WaterLevelController waterLevelController = new WaterLevelController();

    /**
     * 开始游戏方法，将开始游戏前需要准备做的检查，以及游戏的流程在这里进行定义。
     * 在内部使用了游戏子系统的各种类，这个方法将这些类内的复杂调用进行了封装，
     * 使得用户可以无需管理游戏子系统内部的各种复杂的类，只需要调用此方法即可使用该游戏。
     * @throws InterruptedException
     */
    public void startGame() throws InterruptedException{
        System.out.println(descStr + "startGame : 准备开始游戏中...");
        System.out.println(descStr + "startGame : 准备执行海盗船音频设备检查...");
        pirateShip.audioCheck();
        System.out.println(descStr + "startGame : 准备检查屏幕可用性...");
        screen.checkAvailability();
        System.out.println(descStr + "startGame : 准备检查水位...");
        waterLevelController.checkWaterLevel();
        System.out.println(descStr + "startGame : 准备使顾客登船...");
        pirateShip.loadPassengers();
        System.out.println(descStr + "startGame : 准备执行海盗船乘客安全检查...");
        pirateShip.securityCheck();
        System.out.println(descStr + "startGame : 准备海盗船漂流...");
        pirateShip.startFlow();
        System.out.println(descStr + "startGame : 准备屏幕开始播放视频");
        screen.playVideo();
        Thread.sleep(1000);
        System.out.println(descStr + "startGame : 游戏结束...");
        System.out.println(descStr + "startGame : 准备使顾客下船...");
        pirateShip.unloadPassengers();
    }

    private String descStr = "GameFacadeController : (" + this.hashCode() + ") : ";
}
