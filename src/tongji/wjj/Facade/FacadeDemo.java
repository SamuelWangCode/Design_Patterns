package tongji.wjj.Facade;

import tongji.wjj.Facade.ApplyNewProgram.Facade;
import tongji.wjj.Facade.ApplyNewProgram.ProgramApplier;
import tongji.wjj.Register.AddProgram.DisneyRegister;

import java.util.Arrays;
import java.util.Scanner;

public class FacadeDemo {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        System.out.println("Facade设计模式测试 作者：魏敬杰");
        System.out.println("申请一个新的迪士尼游乐项目，请输入该项目的名字：");
        String descStr = "FacadeController : ";
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println(descStr + "请输入对该项目的描述：");
        String content = s.nextLine();
        ProgramApplier newProgram = new ProgramApplier(name, content);
        Facade programFacade = new Facade(newProgram);
        programFacade.loadSubsystem();
        try {
            programFacade.doApply();
            DisneyRegister.set(newProgram);
        } catch (InterruptedException e) {
            System.out.println(descStr + "由于预期之外的错误，项目申请失败。");
        }
    }
}
