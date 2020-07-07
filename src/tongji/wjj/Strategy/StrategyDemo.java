package tongji.wjj.Strategy;

import tongji.wjj.Strategy.FingerGuess.FingerGuessManager;

/**
 * Strategy设计模式Demo By魏敬杰
 */
public class StrategyDemo {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        System.out.println("开始测试Strategy设计模式，场景：小丑猜拳魔术。作者：魏敬杰");
        FingerGuessManager fingerGuessManager = new FingerGuessManager();
        try {
            fingerGuessManager.show();
        } catch (InterruptedException e) {
            System.out.println("StrategyController : 因为一个预期之外的错误，游戏被终止了。");
        }
    }
}
