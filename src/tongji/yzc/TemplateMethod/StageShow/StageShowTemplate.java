package tongji.yzc.TemplateMethod.StageShow;

/**
 * 抽象基类，迪士尼乐园舞台秀表演的基类
 * 拥有所有舞台秀表演都需要的，打开幕布，以及关闭幕布方法的实现
 * 但是具体的表演内容不清楚，所以作为抽象方法，等待子类实现
 * show方法，是TemplateMethod的算法骨干，表达了一个舞台秀的过程
 */
public abstract class StageShowTemplate {

    /**
     * 是算法骨干，TemplateMethod，
     * 表明了所有的表演要先拉开幕布，再表演，再关闭幕布。
     * @throws InterruptedException
     */
    public void show() throws InterruptedException{
        openCurtain();
        doActualPerformance();
        closeCurtain();
    }

    /**
     * 打开幕布的具体实现
     * @throws InterruptedException
     */
    private void openCurtain() throws InterruptedException {
        System.out.println(descStr + "openCurtain: 打开幕布中...");
        Thread.sleep(500);
        System.out.println(descStr + "openCurtain: 打开完毕.");
    }

    /**
     * 关闭幕布的具体实现
     * @throws InterruptedException
     */
    private void closeCurtain() throws InterruptedException {
        System.out.println(descStr + "closeCurtain: 关闭幕布中...");
        Thread.sleep(500);
        System.out.println(descStr + "closeCurtain: 关闭完毕.");
    }

    /**
     * 抽象方法，是具体的表演，等待子类去实现。
     * @throws InterruptedException
     */
    abstract protected void doActualPerformance() throws InterruptedException;

    private String descStr = "StageShowTemplate (" + this.hashCode() + ") : ";

}
