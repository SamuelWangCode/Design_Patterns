package tongji.wxt.Chain_of_Reaposibility.AnnualCardService;


/**
 * 抽象处理者基类
 * 所有处理者都需要继承的基类
 * 定义了一些责任链上的处理者共有的操作
 * 包括设置下一个处理者，获取处理级别，提供服务等
 * 其中，提供服务有待子类具体的处理者实现
 */
public abstract class Handler {
    /**
     *责任链上的下一个处理者
     * 子类可用的protected 类型
     */
    protected Handler nextHandler;

    /**
     * 设置下一个处理者
     * 用于装配责任链
     * @param h
     */
    public void setNextHandler(Handler h){
        this.nextHandler = h;
    }

    /**
     * 读取Customer中的处理等级
     * @param customer  待处理客户
     * @return int类型的处理等级
     */
    public int getLevel(Customer customer){
        return customer.getLevel();
    }


    /**
     * 虚函数
     * 由具体处理者实现提供服务的方法
     * @param customer  待处理客户
     */
    public abstract void ProvideService(Customer customer);
}
