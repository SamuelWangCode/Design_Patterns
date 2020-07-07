package tongji.wjj.Facade.ApplyNewProgram;

/**
 * 具体子系统类，实现了接口中的抽象方法，对项目进行立项。
 */
public class Establish implements Subsystem {
    /**
     * 重写子系统抽象方法。
     * @param p 项目申请类实例
     */
    @Override
    public void method(ProgramApplier p) {
        System.out.println("FacadeController : ("+this.hashCode()+") : "+p.name+"进行立项......");
    }
}
