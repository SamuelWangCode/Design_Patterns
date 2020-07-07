package tongji.wxt.Observer.Bulletin_of_Magic_Show;

/**
 * 接口类 所有需要更新Publisher消息的接收者必须实现该接口
 * 定义了实现消息更新的函数update
 * target为其依赖的消息发布者  obj为提示信息 可以为null
 * 不同类型的消息接收者可以实现不同方式的update方法
 */
public interface MyObserver {
    void update(InfoPublisher target, Object obj);
}
