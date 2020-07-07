package tongji.dyj.Command;

import tongji.dyj.Command.Corsair.*;
/**
Command 模式
 使用场景：迪士尼加勒比海盗，玩家操控海盗船
 海盗船有开炮/前进/左转/右转等功能
 将玩家对海盗船的四种操作封装为对象
 将command的发出者：玩家，与command的执行者：海盗船 解耦合
 **/

public class Main {

    public static void main(String[] args) { test(); }
    public static  void test(){
		System.out.println("欢迎来到迪士尼乐园加勒比海盗游戏！");
		System.out.println("你现在正在操控一艘海盗船:");
		Corsair corsair=new Corsair("海盗船1号");
		MoveForwardCommand moveForwardCommand=new MoveForwardCommand(corsair);
		FireCommand fireCommand=new FireCommand(corsair);

		Player player=new Player();
		player.setFireCommand(fireCommand);
		player.setMoveForwardCommand(moveForwardCommand);

		player.MoveForward();
		player.Fire();
	}
}
