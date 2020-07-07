package tongji.wjj.Facade.ApplyNewProgram;

/**
 * 具体子系统类，实现了接口中的抽象方法，对项目进行审核。
 */
public class Examine implements Subsystem {
    /**
     * 重写子系统抽象方法。
     * @param p 项目申请类实例
     */
    @Override
    public void method(ProgramApplier p) {
        System.out.println("FacadeController : ("+this.hashCode()+") : "+"项目"+p.name+"的内容为："+p.content);
        System.out.println("FacadeController : ("+this.hashCode()+") : "+"对其进行审批中......");
    }
}
