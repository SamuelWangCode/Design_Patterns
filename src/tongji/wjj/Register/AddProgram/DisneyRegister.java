package tongji.wjj.Register.AddProgram;

import tongji.wjj.Facade.ApplyNewProgram.ProgramApplier;

import java.util.ArrayList;

/**
 * 注册模式的核心类，包含了一个静态成员——注册树，以及对注册树进行增删改的操作。
 */
public class DisneyRegister {
    private static ArrayList<ProgramApplier> tree = new ArrayList<ProgramApplier>();

    /**
     * 检查注册树中是否已有同名项目，若无，将该项目加入注册树。
     * @param p 项目申请实体类（见Facade）
     */
    public static void set(ProgramApplier p) {
        for (ProgramApplier i:tree
        ) {
            if(i.name.equals(p.name)) {
                System.out.println("RegisterController : "+"已有该名字的项目，取消创建。");
                return;
            }
        }
        tree.add(p);
        System.out.println("RegisterController : "+"已将其插入注册树。");
    }

    /**
     * 检查注册树中是否有对应名字的项目，若有，输出其名字和介绍。
     * @param name 项目名字
     */
    public static void get(String name) {
        for (ProgramApplier i:tree
             ) {
            if(i.name.equals(name)) {
                System.out.println("RegisterController : "+"项目名称为："+i.name);
                System.out.println("RegisterController : "+"项目描述为："+i.content);
                return;
            }
        }
        System.out.println("RegisterController : "+"不存在该名字的项目！");
    }

    /**
     * 检查注册树中是否有对应名字的项目，若有，将其移除。
     * @param name 项目名字
     */
    public static void unSet(String name) {
        for (ProgramApplier i:tree
             ) {
            if(i.name.equals(name)) {
                tree.remove(i);
                System.out.println("RegisterController : "+"移除该项目成功!");
                return;
            }
        }
        System.out.println("RegisterController : "+"不存在该名字的项目，移除失败！");
    }
}
