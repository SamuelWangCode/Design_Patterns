package tongji.wxt.Chain_of_Reaposibility.AnnualCardService;

/**
 * 枚举类型，表示年卡等级
 * 年卡有三种 周日年卡（等级1），平日+周日年卡（等级2）， 无限年卡（等级3）
 * 没有年卡视为 Nothing（等级0）
 * 获取枚举类型是已根据上述规则默认生成级别
 */
 public enum AnnualCardLevel {
    Sunday(1), SundayPlus(2), AllDays(3), Nothing(0);
    private AnnualCardLevel(int i) {this.level = i;}
    private int level;
    public int getLevel(){
        return this.level;
    }

 }
