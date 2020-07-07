package tongji.dyj.Command.Corsair;

public class FireCommand implements Command {
    //构造函数
    public FireCommand(){
        this(null);
    }
    public FireCommand(Corsair corsair){
        this.corsair=corsair;
    }
    //执行指令的目标对象
    private Corsair corsair=null;

    public void setCorsair(Corsair corsair){
        if(corsair!=this.corsair&&corsair!=null) {
            this.corsair=corsair;
        }
    }

    //让目标执行指令
    @Override
    public void execute() {
        if (corsair != null) {
            corsair.Fire();
        } else {
            System.out.println("FireCommand : ("+this.hashCode()+"):"+" execute : "+"Please set corsair first");
        }
    }
}
