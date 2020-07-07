package tongji.dyj.State.Disneyland;

/**
 * 游乐园当前人数状态的基类
 */
public abstract class State {
    public abstract void peopleEnter(Disneyland land);
    public abstract void peopleOut(Disneyland land);
}
