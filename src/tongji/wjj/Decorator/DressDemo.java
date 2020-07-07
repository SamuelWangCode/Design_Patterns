package tongji.wjj.Decorator;

import tongji.wjj.Decorator.DressPrincess.ConcretePrincess;
import tongji.wjj.Decorator.DressPrincess.Decorator;
import tongji.wjj.Decorator.DressPrincess.EnglandPreppyStyle;
import tongji.wjj.Decorator.DressPrincess.EuropeanRoyalStyle;

import java.util.Arrays;
import java.util.Scanner;

public class DressDemo {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        System.out.println("Dress设计模式测试 作者：魏敬杰");
        System.out.println("欢迎来到迪士尼公主换装游戏！");
        String descStr = "DressController : ";
        System.out.println(descStr + "生成一个公主,请输入她的名字：");
        Scanner s = new Scanner(System.in);
        String temp = s.nextLine();
        ConcretePrincess princess = new ConcretePrincess(temp);
        System.out.println(descStr + "设置公主的风格:ER(欧洲皇室风格)/EP(英伦学院风)");
        temp = s.nextLine();
        while(!temp.equals("ER")&&!temp.equals("EP")) {
            System.out.println(descStr + "请重新输入正确的风格");
            temp = s.nextLine();
        }
        Decorator dressStyle;
        if(temp.equals("ER")) dressStyle = new EuropeanRoyalStyle(princess);
        else dressStyle = new EnglandPreppyStyle(princess);
        try {
            dressStyle.dress();
        } catch (InterruptedException e) {
            System.out.println(descStr + "因为一个预期之外的错误，公主换装失败。");
        }
    }
}
