package tongji.wxt.Iterator.LinghtintControl;

/**
 * 所有灯光的接口类
 * 定义了所有种类灯光都必须拥有的 开灯、关灯、移动、停止等方法
 *有新的种类的灯光添加时，需要实现该接口
 */
public interface Light {
    /**
     *分别为开灯、关灯、移动、停止方法
     */
    void LightOn();
    void LightOff();
    void LightMove();
    void LightStop();
}
