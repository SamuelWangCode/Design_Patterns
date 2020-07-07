package tongji.wxt.Chain_of_Reaposibility.AnnualCardService;


/**
 * 顾客类，作为责任链待处理的对象
 * 共有三种不同级别
 * 由1,2,3表示
 */
public class Customer {
    /**
     * 表示顾客级别
     */
    private int level;

    /**
     * 顾客类的实例化需要一个表示年卡等级的枚举类型
     * 并将该类型的级别作为自己的级别
     * @param acl 年卡等级类型
     */
    public Customer(AnnualCardLevel acl){
        this.level = acl.getLevel();
    }

    /**
     * 返回顾客的级别
     * @return level
     */
    public int getLevel(){
        return this.level;
    }

}
