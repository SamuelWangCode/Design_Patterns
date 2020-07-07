package tongji.ljn.Memento;

/**
 * Memento设计模式
 */
public class MementoDemo {
    public static void main(String[] args){test();}
    public static void test(){
        System.out.println("啊！你终于来了，公主需要你的保护~");

        //创建原始类
        Originator originator = new Originator("一级白雪公主");

        //创建备忘录
        Caretaker caretaker = new Caretaker(originator.createMemento());

        //修改原始类的状态
        System.out.println("这位女子原来的身份是："+originator.getlevel());
        originator.setlevel("三级残废丑八怪");
        System.out.println("被邪恶的巫婆施法后，身份变成了："+originator.getlevel());

        //恢复原始状态
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("帅气的你解救了公主，恢复了她美丽尊贵的身份："+originator.getlevel());
        System.out.println("谢谢你解救了公主！公主说，等你设计模式拿了优回来娶她~");
    }
}
