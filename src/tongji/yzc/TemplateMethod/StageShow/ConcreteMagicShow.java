package tongji.yzc.TemplateMethod.StageShow;

/**
 * 这个类不是抽象类，是套用魔术舞台秀表演模板的真正的类。
 * 它实现了父类的抽象方法。
 */
public class ConcreteMagicShow extends MagicStageShowTemplate {
    /**
     * 构建一个魔术表演的构造函数，需要知道魔术的名字，以及需要的魔术工具
     * @param magicShowName
     * @param magicTools
     */
    public ConcreteMagicShow(String magicShowName, String magicTools){
        this.magicTools = magicTools;
        this.magicShowName = magicShowName;
    }

    /**
     * 真正的表演魔术的方法
     * @throws InterruptedException
     */
    @Override
    protected void performMagic() throws InterruptedException{
        System.out.println(descStr + "performMagic : 准备开始表演真正的魔术...");
        System.out.println(descStr + "performMagic : 使用道具 " + this.magicTools + " 来表演魔术.");
        Thread.sleep(1000); //消耗一秒，代表魔术表演过程
        System.out.println(descStr + "performMagic : 真正的魔术表演结束...");
    }

    private String descStr = "ConcreteMagicShow (" + this.hashCode() + ") : ";
}
