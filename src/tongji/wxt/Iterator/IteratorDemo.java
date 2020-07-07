package tongji.wxt.Iterator;

import tongji.wxt.Iterator.LinghtintControl.LightController;
import tongji.wxt.Iterator.LinghtintControl.SpotLight;

public class IteratorDemo {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        LightController controller = new LightController();
        for(int i = 0; i<6;i++){
            controller.addLights(new SpotLight());
        }
        /*
        正常顺序测试通过Iterator控制的灯光，正常顺序为开灯、移动、停止、关灯。
         */
        controller.turnOn();
        controller.Move();
        controller.stop();
        controller.turnOff();
    }
}
