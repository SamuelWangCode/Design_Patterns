package tongji.ljn.Memento;

/**
 *Originator:负责创建一个备忘录，可以记录、恢复自身的内部状态
 */
public class Originator {
    private String level;
    private String descStr="Originator("+this.hashCode()+"):";
    public Originator(String level){
        this.level = level;
    }
    public String getlevel(){
        System.out.println(descStr+"getlevel：");
        return level;
    }
    public void setlevel(String level){
        System.out.println(descStr+"setlevel：");
        this.level = level;
    }
    public  Memento createMemento(){
        return new Memento(level);
    }
     public void  restoreMemento(Memento memento){
        this.level = memento.getLevel();
     }

}
