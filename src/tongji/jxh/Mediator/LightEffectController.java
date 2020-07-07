package tongji.jxh.Mediator;

public class LightEffectController {
    private InteractionMediator mediator;
    private String prefix = "LightEffectController (" + this.hashCode()+") : ";

    LightEffectController(InteractionMediator mediator){
        this.mediator=mediator;
        mediator.setLight(this);
    }

    public void blaze()throws InterruptedException{
        mediator.reply(prefix +"blaze: Coolest lighting effect for you!");
        Thread.sleep(500);
    }

    public void twinkling()throws InterruptedException{
        mediator.reply(prefix +"twinkling: It's our showcase!");
        Thread.sleep(500);
    }

    public void quench()throws InterruptedException{
        mediator.reply(prefix +"quench: Calm down...");
        Thread.sleep(500);
    }
}
