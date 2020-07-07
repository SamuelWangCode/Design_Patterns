package tongji.wjj.Strategy.FingerGuess;

/**
 * 迪士尼乐园“小丑猜拳游戏”中，小丑策略选择的接口。
 * 该接口声明了一个判断策略的方法，并由不同的策略类对其进行实现。
 * 不同的策略类实现策略的方法是不同的。但可以由同一个接口来获取不同的策略。
 */

public interface Strategy {

    /**
     * 接口中“获取策略”方法的声明，由实现该接口的类来重写该方法。
     * 方法获取一个出拳策略并返回策略内容
     * @return 策略内容
     */
    String getStrategy();
}
