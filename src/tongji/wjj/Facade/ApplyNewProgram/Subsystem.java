package tongji.wjj.Facade.ApplyNewProgram;

/**
 * 子系统的抽象接口，含有该子系统要进行的方法，由具体子系统类进行实现。
 */
public interface Subsystem {
    /**
     * 每个子系统具有的独特方法， 留待具体子系统实现。
     * @param p 项目申请类实例
     */
    void method(ProgramApplier p);
}
