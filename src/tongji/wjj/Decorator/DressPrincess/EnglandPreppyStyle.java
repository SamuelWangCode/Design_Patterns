package tongji.wjj.Decorator.DressPrincess;

/**
 * 具体的装饰器类，实现了父类中的抽象方法。
 */
public class EnglandPreppyStyle extends Decorator {
    /**
     * 具体装饰器类的构造函数，将AbstractPrincess类型的参数传到父类的构造函数中进行初始化。
     * @param x 要装饰的公主对象
     */
    public EnglandPreppyStyle(AbstractPrincess x) {
        super(x);
    }

    /**
     * 对父类中着装方法的实现。为公主具体装上英伦学院风的装束。
     * @throws InterruptedException
     */
    @Override
    public void dress() throws InterruptedException {
        System.out.println("DecoratorController : ("+this.hashCode()+") : "+"公主"+princess.getName()+"的着装风格是英伦学院风");
        Thread.sleep(500);
        System.out.println("DecoratorController : ("+this.hashCode()+") : "+"公主"+princess.getName()+"开始换上英伦学院套装......");
        Thread.sleep(500);
        princess.setSuit("England preppy style");
        System.out.println("DecoratorController : ("+this.hashCode()+") : "+"公主"+princess.getName()+"换装完毕！");
        Thread.sleep(500);
        princess.show();
    }
}
