package tongji.ljn.Memento;

/**
 * 备忘录角色，用于存储Originator的内部状态，并且可以防止Originator以外的对象访问Memento
 */
public class Memento {
    private String level;

    public Memento(String level){
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level){
        this.level = level;
    }

}
