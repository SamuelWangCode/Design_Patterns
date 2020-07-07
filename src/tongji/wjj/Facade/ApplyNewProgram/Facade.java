package tongji.wjj.Facade.ApplyNewProgram;

import java.util.ArrayList;

/**
 * 外观类，将项目申请的所有细节封装在该类中。
 * 用一个ArrayList存储这个项目过程中的所有子系统。
 * 通过该类的doApply方法来调用各个子系统执行流程，每个子系统的执行会得到该项目申请实例作为参数。
 */
public class Facade {
    private ArrayList<Subsystem> subsystems;
    private ProgramApplier program;

    /**
     * 外观类实例的构造函数，传入项目申请类实例进行初始化。
     * @param program 项目申请类实例。
     */
    public Facade(ProgramApplier program) {
        this.program = program;
        subsystems = new ArrayList<Subsystem>();
    }

    /**
     * 加载子系统的方法。如果有多种不同的外观类，可以将Facade写成一个抽象类，并在其子类中为Facade加载不同的子系统序列。
     * 在本例中，由于只有一种外观类，故直接在Facade上进行实现。
     */
    public void loadSubsystem() {
        subsystems.add(new Establish());
        subsystems.add(new Examine());
        subsystems.add(new Approval());
    }

    /**
     * 执行外观类操作的方法。
     * 对于存储在外观类实例中的子系统序列，按顺序逐一执行子系统的操作。
     * 外界只需要调用该方法，即可完成多个子系统中的复杂内容。
     * @throws InterruptedException
     */
    public void doApply() throws InterruptedException {
        System.out.println("FacadeController : ("+this.hashCode()+") : "+"开始进行项目审批！");
        for (Subsystem i: subsystems
             ) {
            i.method(program);
            Thread.sleep(1000);
        }
        System.out.println("FacadeController : ("+this.hashCode()+") : "+"项目申请流程完成！");
    }
}
