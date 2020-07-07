package tongji.wjj.Facade.ApplyNewProgram;

/**
 * 具体子系统类，实现了接口中的抽象方法，批准项目通过。
 */
public class Approval implements Subsystem {
    /**
     * 重写子系统抽象方法。
     * @param p 项目申请类实例
     */
    @Override
    public void method(ProgramApplier p) {
        System.out.println("FacadeController : ("+this.hashCode()+") : "+p.name+"的审批通过，可以进行建设了。");
    }
}
