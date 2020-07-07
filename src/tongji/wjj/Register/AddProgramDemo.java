package tongji.wjj.Register;

import tongji.wjj.Facade.FacadeDemo;
import tongji.wjj.Register.AddProgram.DisneyRegister;
import java.util.Scanner;

public class AddProgramDemo {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        String temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Register设计模式测试 作者：魏敬杰");
        System.out.println("欢迎进入迪士尼乐园项目注册管理(与Facade模式相结合)！");
        System.out.println("你可以在这里管理迪士尼乐园的游乐项目");
        System.out.println("输入get name来查看名为name的项目信息");
        System.out.println("输入unset name来删除名为name的项目信息");
        System.out.println("输入set来注册一个新的项目，输入exit退出。");
        temp=s.nextLine();
        while(!temp.equals("exit")) {
            if(temp.equals("set")) FacadeDemo.main(new String[1]);
            else {
                String[] op = temp.split(" ");
                if(op[0].equals("get")) DisneyRegister.get(op[1]);
                else if(op[0].equals("unset")) DisneyRegister.unSet(op[1]);
                else System.out.println("请输入一个正确的命令！");
            }
            System.out.println("执行完毕，请输入下一条命令！");
            temp = s.nextLine();
        }
    }
}
