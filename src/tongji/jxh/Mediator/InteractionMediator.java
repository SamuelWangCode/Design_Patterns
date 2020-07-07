package tongji.jxh.Mediator;

// Serve as the mediator
public class InteractionMediator {
    private Human driver;
    private LightEffectController light;
    private PivotalCoreSystem core;

    public InteractionMediator(){}

    public void setHuman(Human driver){
        this.driver=driver;
    }

    public void setLight(LightEffectController light){
        this.light=light;
    }

    public void setCore(PivotalCoreSystem core){
        this.core = core;
    }

    public void greet() throws InterruptedException{
        core.greet();
        light.blaze();
        light.twinkling();
    }

    public void reply(String msg){
        driver.readResponse(msg);
    }

    public void relay(String msg) throws InterruptedException{
        core.setDest(msg);
        core.takeOverDriving();
    }

    public void farewell()throws InterruptedException{
        light.quench();
        core.farewell();
    }
}
