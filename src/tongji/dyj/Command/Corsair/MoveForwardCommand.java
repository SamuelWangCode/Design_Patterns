package tongji.dyj.Command.Corsair;

public class MoveForwardCommand implements Command {
    //构造函数
    public MoveForwardCommand(){
        this(null);
    }
    public MoveForwardCommand(Corsair corsair){
        this.corsair=corsair;
    }
    //执行指令的目标对象
    private Corsair corsair=null;

    public void setCorsair(Corsair corsair){
        if(corsair!=this.corsair&&corsair!=null) {
            this.corsair=corsair;
        }
    }

    //令目标执行指令
    @Override
    public void execute(){
        if(corsair!=null){
            corsair.MoveForward();
        }
        else {
            System.out.println("MoveForwardCommand : ("+this.hashCode()+"):"+" execute : "+"Please set corsair first");
        }
    }
}
