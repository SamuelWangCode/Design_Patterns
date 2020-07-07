package tongji.yzc.Bridge.BuzzLightyearRescue.ToyGun;

/**
 * Shotable接口的实现类，属于枪支这一维度，
 * 与矿车无关，只需要自己实现开枪射击敌人的方法即可。
 */
public class ToyShotGun implements Shotable {

    /**
     * 实现接口Shotable中的方法，
     * 意义是用霰弹枪射击敌人。
     * @param enemy
     */
    @Override
    public void shot(String enemy){
        System.out.println(descStr + "shot : 霰弹枪射击敌人：" + enemy);
    }

    private String descStr = "ToyLaserGun : (" + this.hashCode() + ") : ";
}
