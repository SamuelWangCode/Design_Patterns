package tongji.ljn.Memento;

/**
 * 负责存储备忘录，不能对备忘录的内容进行操作和访问，只能够将备忘录传递给其他对象
 */
public class Caretaker {
    private  Memento memento;
    public Caretaker(Memento memento){
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento){
        this.memento = memento;
    }
}

