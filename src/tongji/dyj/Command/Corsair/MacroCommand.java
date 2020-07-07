package tongji.dyj.Command.Corsair;

import java.util.Iterator;
import java.util.Stack;

/**
 * 组合指令，可将指令按执行的顺序入栈存储
 * 用于记录指令和实现撤销指令
 *
 * 本例中未使用
 */
public class MacroCommand implements Command{
    Stack<Command> commands= new Stack<>();

    @Override
    public void execute() {
        Iterator it=commands.iterator();
        while (it.hasNext()) {
            Command command=(Command) it.next();
            command.execute();
        }
    }
    //将指令入栈
    public void append(Command command) {
        if(command!=this&&command!=null) {
            commands.add(command);
        }
    }

    public void clear(){
        commands.clear();
    }
    //撤销最近的一条指令
    public void undo(){
        if(!commands.isEmpty()){
            commands.pop();
        }
    }
}
