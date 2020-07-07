package tongji.wjj.Decorator.DressPrincess;

/**
 * 迪士尼乐园“公主换装”项目中，实现了每个公主所具有的功能的接口。
 * 每个公主都具有展示自己着装、设置自己着装和介绍自己名字的功能。
 * 由具体的公主类ConcretePrincess来实现该接口的方法。
 * 在装饰器中以field形式存在。
 */
public interface AbstractPrincess {
    /**
     * 公主展示自己着装的方法。
     */
    void show();

    /**
     * 公主设置自己着装的方法。
     * @param x 套装名字
     */
    void setSuit(String x);

    /**
     * 获取公主名字的方法
     * @return 公主的名字，String类型。
     */
    String getName();
}
