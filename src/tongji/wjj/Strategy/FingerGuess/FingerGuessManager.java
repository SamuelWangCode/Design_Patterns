package tongji.wjj.Strategy.FingerGuess;

import tongji.yzc.TemplateMethod.StageShow.MagicStageShowTemplate;

import java.util.Scanner;

/**
 * 迪士尼乐园“小丑猜拳魔术”的管理类。
 * 控制猜拳游戏的进程。
 * 实现了游戏中每个过程——玩家出拳、小丑思考策略、小丑出拳这三个方法。
 * 小丑的策略选择是根据玩家出拳的内容决定的。
 * guessStrategy是一个Strategy类型的成员，根据玩家出拳的类型，guessStrategy指向的会是不同的实现类。
 */

public class FingerGuessManager extends MagicStageShowTemplate {

    private String playerFinger;
    private String clownFinger;
    private Strategy guessStrategy;

    /**
     * 构造函数，为父类中的magicShowName和magicTools赋值。
     */
    public FingerGuessManager() {
        magicShowName = "小丑猜拳魔术";
        magicTools = "小丑玩偶和白布";
    }

    /**
     * 算法骨干，说明了每次猜拳游戏都具有以下的过程：
     * 玩家出拳回合、小丑思考策略、小丑出拳回合、宣布游戏结果。
     */
    public void run() throws InterruptedException {
        while(true) {
            playerTurn();
            if(playerFinger.equals("exit")) {
                System.out.println("StrategyController : ("+this.hashCode()+") : "+"玩家退出游戏，游戏终止！");
                break;
            }
            thinkingStrategy();
            clownTurn();
            gameResult();
            Thread.sleep(1000);  //等待一秒钟来开始下局游戏
        }
    }

    /**
     * 玩家出拳回合方法的具体实现：
     * 由玩家输入出拳内容，或选择退出。
     */
    private void playerTurn() {
        System.out.println("StrategyController : ("+this.hashCode()+") : "+"现在是玩家出拳回合，请玩家输入要出的类型：scissor/rock/paper，输入exit可退出");
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();
        while(!x.equals("scissor")&&!x.equals("rock")&&!x.equals("paper")&&!x.equals("exit")) {
            System.out.println("StrategyController : ("+this.hashCode()+") : "+"输入了一个错误的内容，请重新输入：");
            x=s.nextLine();
        }
        playerFinger = x;
    }

    /**
     * 小丑策略思考的具体实现：
     * 根据玩家输入的策略，小丑选择将guessStrategy成员指向不同的策略类。
     */
    private void thinkingStrategy() throws InterruptedException {
        System.out.println("StrategyController : ("+this.hashCode()+") : "+"小丑思考策略中......");
        Thread.sleep(1000); //小丑消耗一秒来思考策略。
        if(playerFinger.equals("scissor")) guessStrategy = new StrategyForScissor();
        else if(playerFinger.equals("rock")) guessStrategy = new StrategyForRock();
        else if(playerFinger.equals("paper")) guessStrategy = new StrategyForPaper();
        System.out.println("StrategyController : ("+this.hashCode()+") : "+"小丑策略思考完毕。");
    }

    /**
     * 小丑出拳回合的具体实现：
     * 小丑将想好的策略打出来。
     */
    private void clownTurn() throws InterruptedException {
        Thread.sleep(500);  //小丑花半秒钟出拳
        clownFinger = guessStrategy.getStrategy();
        System.out.println("StrategyController : ("+this.hashCode()+") : "+"现在是小丑出拳回合！小丑出的是：" + clownFinger);
    }

    /**
     * 结果宣布过程具体实现：
     * 小丑必定获胜。
     */
    private void gameResult() throws InterruptedException {
        Thread.sleep(500);  //留半秒钟宣布结果
        System.out.println("StrategyController : ("+this.hashCode()+") : "+"结果宣布：小丑获胜！");
    }

    /**
     * 重写父类中“魔术表演过程”的方法。直接调用骨架函数run()。
     * @throws InterruptedException
     */
    @Override
    protected void performMagic() throws InterruptedException {
        run();
    }
}
