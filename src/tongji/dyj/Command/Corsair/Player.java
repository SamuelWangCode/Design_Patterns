package tongji.dyj.Command.Corsair;
/**
 *玩家
 * command的发出者
 * 只实现了前进和开炮两个指令 其他指令同理
 */

public class Player {
    private MoveForwardCommand moveForwardCommand=null;

    public void setMoveForwardCommand(MoveForwardCommand moveForwardCommand) {
        this.moveForwardCommand = moveForwardCommand;
    }

    private FireCommand fireCommand=null;

    public void setFireCommand(FireCommand fireCommand) {
        this.fireCommand = fireCommand;
    }

    public void MoveForward(){
        if(moveForwardCommand!=null){
            moveForwardCommand.execute();
        }
    }

    public void Fire(){
        if(fireCommand!=null){
            fireCommand.execute();
        }
    }
}
