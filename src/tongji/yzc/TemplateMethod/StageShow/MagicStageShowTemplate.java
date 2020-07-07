package tongji.yzc.TemplateMethod.StageShow;

/**
 * 这是一个魔术表演的抽象类，继承了舞台秀表演类，
 * 实现了doActualPerformance的抽象方法。
 * 并且根据实际的魔术表演，有主持人讲话，准备魔术道具，回收魔术道具等私有方法，
 * 这些构成了doActualPerformance的算法骨干。
 * 并且声明了抽象方法：performMagic，以待子类实现。
 */
public abstract class MagicStageShowTemplate extends StageShowTemplate{

    protected String magicTools = "default tools";
    protected String magicShowName = "default name";
    /**
     * 实现父类的抽象方法。
     * 同时也是TemplateMethod的实现，
     * 是算法的骨干。
     * @throws InterruptedException
     */
    @Override
    protected void doActualPerformance() throws InterruptedException{
        hostSpeak();
        prepareTools();
        performMagic();
        cleanUpTools();
    }

    /**
     * 主持人讲话，这是这个层次的类可以实现的内容。
     * @throws InterruptedException
     */
    private void hostSpeak() throws InterruptedException{
        System.out.println(descStr + "hostSpeak : 主持人开始介绍节目...");
        //System.out.println(descStr + "hostSpeak : 主持人开始介绍节目...");
        System.out.println(descStr + "hostSpeak : 我们即将开始魔术 " + magicShowName + " 的表演.");
        Thread.sleep(1000);
        System.out.println(descStr + "hostSpeak : 主持人介绍完毕.");
    }

    /**
     * 准备魔术用具
     * @throws InterruptedException
     */
    private void prepareTools() throws InterruptedException{
        System.out.println(descStr + "prepareTools : 给魔术师准备道具中... 道具为 " + magicTools);
        Thread.sleep(1000);
        System.out.println(descStr + "prepareTools : 准备道具完毕.");
    }

    /**
     * 回收魔术用具
     * @throws InterruptedException
     */
    private void cleanUpTools() throws InterruptedException{
        System.out.println(descStr + "doActualPerformance : 回收道具中...");
        Thread.sleep(1000);
        System.out.println(descStr + "doActualPerformance : 回收道具完毕.");
    }

    /**
     * 抽象方法，等待子类来实现真正的魔术表演。
     * @throws InterruptedException
     */
    abstract protected void performMagic() throws InterruptedException;

    private String descStr = "MagicStageShowTemplate (" + this.hashCode() + ") : ";
}
