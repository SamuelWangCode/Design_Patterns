package tongji.wxt.Iterator.LinghtintControl;

/**聚光灯
 * 一个具体灯光类的样例，实现了Light接口，重写了自己的开灯、
 * 关灯、移动、停止方法
 */
public class SpotLight implements Light {
    /**
     * 表明聚光灯当前状态的两个变量
     */
    private boolean isOn = false;
    private boolean isMove = false;

    /**
     * 开灯方法的具体实现
     * 当灯已打开时调用该方法只会输出提示信息
     * 不返回错误
     */
    @Override
    public void LightOn() {
        if (!isOn){
            this.isOn = true;
            System.out.println(descStr + "Spotlight turned on successfully.");
        }
        else System.out.println("This spotlight is on.");
    }

    /**
     * 关灯方法的具体实现
     * 当灯已处于关闭状态时调用该方法，输出提示信息
     * 当灯处于移动状态时调用该方法，提示先停止移动才能进行关灯操作，但不返回错误信息
     */
    @Override
    public void LightOff() {
        if (isOn&!isMove){
            isOn = false;
            System.out.println(descStr + "Spotlight turned off successfully.");
        }
        else if (isMove)
            System.out.println(descStr + "This spotlight is moving. Please stop it first.");
        else System.out.println(descStr + "This spotlight is off.");
    }

    /**
     * 移动方法的具体实现
     * 当灯光打开后才能可以进行移动
     * 处于移动过程中调用该方法不返回错误
     */
    @Override
    public void LightMove() {
        if (!isMove&isOn){
            isMove = true;
            System.out.println(descStr + "Spotlight starts to move.");
        }
        else if (!isOn)
            System.out.println(descStr + "This spotlight is off, and can not move.");
        else System.out.println(descStr + "This spotlight is moving");
    }

    /**
     * 停止方法的具体实现
     * 当灯光未移动时调用该方法，不返回错误
     */
    @Override
    public void LightStop() {
        if (isMove){
            isMove = false;
            System.out.println(descStr + "Spotlight stops.");
        }
        else System.out.println(descStr + "This spotlight is NOT moving.");

    }

    private String descStr = this.getClass().getSimpleName() +" ("+ this.hashCode() + ") : ";
}
