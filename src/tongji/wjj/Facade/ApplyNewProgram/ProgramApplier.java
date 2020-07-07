package tongji.wjj.Facade.ApplyNewProgram;

/**
 * 项目申请类，其中包含了要申请的项目的基本信息，相当于一份申请书。
 * 将这份“申请书”作为参数传递给外观类Facade，外观类会在内部完成所有的流程，具体操作对外部透明。
 */
public class ProgramApplier {
    public String name;
    public String content;

    /**
     * 项目申请类的构造函数。
     * @param name 项目名字
     * @param content 项目描述。
     */
    public ProgramApplier(String name,String content) {
        this.name = name;
        this.content = content;
    }
}
