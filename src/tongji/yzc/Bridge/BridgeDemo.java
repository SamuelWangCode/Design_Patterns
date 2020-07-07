package tongji.yzc.Bridge;

import tongji.yzc.Bridge.BuzzLightyearRescue.Cart;
import tongji.yzc.Bridge.BuzzLightyearRescue.FightAlienCart;
import tongji.yzc.Bridge.BuzzLightyearRescue.FightZombieCart;
import tongji.yzc.Bridge.BuzzLightyearRescue.ToyGun.ToyLaserGun;
import tongji.yzc.Bridge.BuzzLightyearRescue.ToyGun.ToyShotGun;

public class BridgeDemo {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        Cart fightZombieCart = new FightZombieCart(new ToyLaserGun(), new ToyShotGun(), new ToyLaserGun());
        Cart fightAlienCart = new FightAlienCart(new ToyShotGun(), new ToyLaserGun(), new ToyLaserGun());
        try{
            fightZombieCart.start();
            Thread.sleep(1000);
            fightAlienCart.start();
        }catch(InterruptedException e){
            System.out.println("BridgeDemo : test : 中止");
        }
    }
}
