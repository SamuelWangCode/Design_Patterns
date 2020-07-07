package tongji.wjj.Strategy.FingerGuess;

/**
 * 迪士尼乐园“小丑猜拳游戏”中，实现了Strategy接口的具体类。
 * 该类是在玩家出布的情况下要采用的策略，实现了接口中getStrategy方法并返回“出剪刀”的策略。
 */

public class StrategyForPaper implements Strategy {

    /**
     * 实现了接口中获取策略的方法，该策略返回一个“出剪刀”的策略
     * @return 策略内容
     */

    @Override
    public String getStrategy() {
        System.out.println("StrategyController : ("+this.hashCode()+") : "+"小丑思考出了策略——出剪刀。");
        return "scissor";
    }
}
