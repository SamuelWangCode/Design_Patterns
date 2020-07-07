package tongji.wxt.Iterator.LinghtintControl;

import java.util.Iterator;
import java.util.Vector;

/**灯光控制类
 *内部有一个容器存放该控制类所管理的一组灯光
 *可以通过Iterator方法访问每一个灯光，并实现对其进行操作
 *在不同的操作中使用了两种Iterator使用方法
 */
public class LightController {
    private Vector<Light> controlScope;
    private String controllerName;

    public LightController(String name){
        this.controllerName = name;
        this.controlScope = new Vector<Light>();
    }

    public LightController(){
        this("DefaultController");
    }

    /**
     *向容器中添加新的需要被该控制器管理的灯光
     */
    public void addLights(Light l){
        controlScope.addElement(l);
    }

    /**
     *从容器中删除不需要被该类管理的灯光
     */
    public void removeLights(Light l){
        if (controlScope.contains(l))
            controlScope.removeElement(l);
    }

    /**
     * 以下为通过控制器对一组灯光进行 开灯、关灯、
     * 移动、停止等操作。
     * 使用了不同的方式调用Iterator
     * 可以直接用作测试方法
     */
    public void turnOn(){
        int i = 1;
        System.out.println(descStr + "Begin to turn on lights");
        for (Iterator<Light> iter = controlScope.iterator();iter.hasNext(); ){
            Light temp = iter.next();
            System.out.print(descStr + "Light " + i + ":   ");
            i += 1;
            temp.LightOn();
        }

        System.out.println(descStr + "All lights turned on.");
    }

    public void turnOff(){
        int i = 1;
        System.out.println(descStr + "Begin to turn off lights.");
        Iterator<Light> iter = controlScope.iterator();
        while(iter.hasNext()){
            Light temp = iter.next();
            System.out.print(descStr + "Light " + i + ":   ");
            i += 1;
            temp.LightOff();
        }

        System.out.println(descStr +"All lights turned off.");
    }

    public void Move(){
        int i = 1;
        System.out.println(descStr + "Let lights move.");
        Iterator<Light> iterator = controlScope.iterator();
        while (iterator.hasNext()){
            Light temp = iterator.next();
            System.out.print("Light " + i + ":   ");
            i += 1;
            temp.LightMove();
        }

        System.out.println(descStr + "All lights start to move.");

    }
    public  void stop(){
        int i = 1;
        System.out.println(descStr + "Let lights stop.");
        for(Iterator<Light> iter = controlScope.iterator();iter.hasNext(); ){
            Light temp = iter.next();
            System.out.print(descStr + "Light " + i + ":   ");
            i += 1;
            temp.LightStop();
        }

        System.out.println(descStr + "All lights stop.");
    }

    private String descStr = this.getClass().getSimpleName() +" ("+ this.hashCode() + ") : ";


}
