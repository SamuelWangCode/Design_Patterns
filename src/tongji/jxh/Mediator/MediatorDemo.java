package tongji.jxh.Mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        try {
            test();
        }
        catch (InterruptedException e){
            System.out.println("Main: main: Game is terminated...");
        }
    }

    public static void test() throws InterruptedException{
        System.out.println("开始测试Mediator 作者：江宵汉");

        InteractionMediator mediator=new InteractionMediator();

        Human driver=new Human(mediator);
        LightEffectController light=new LightEffectController(mediator);
        PivotalCoreSystem drivingSystem=new PivotalCoreSystem(mediator);

        mediator.setHuman(driver);
        mediator.setLight(light);
        mediator.setCore(drivingSystem);

        String dest="the Royal Banquet Hall";
        driver.enter();
        driver.drive(dest);
        driver.leave();
    }
}
