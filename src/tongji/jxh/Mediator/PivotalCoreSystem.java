package tongji.jxh.Mediator;

public class PivotalCoreSystem {
    private InteractionMediator mediator;
    private String prefix = "PivotalCoreSystem (" + this.hashCode()+") : ";

    public PivotalCoreSystem(InteractionMediator mediator){
        this.mediator=mediator;
    }

    public void setDest(String dest)throws InterruptedException{
        mediator.reply(prefix +"setDest: Alright, we'll get to "+dest+" in the blink of an eye.");
        Thread.sleep(500);
    }

    public void greet() throws InterruptedException{
        mediator.reply(prefix +"greet: Welcome!");
        Thread.sleep(1000);
    }

    public void farewell()throws InterruptedException{
        mediator.reply(prefix +"farewell: Look forward to serving you next time!");
        Thread.sleep(500);
    }

    public void takeOverDriving()throws InterruptedException{
        mediator.reply(prefix +"takeOverDriving: Let me handle all the driving course for you.");
        Thread.sleep(1000);
        galloping();
    }

    public void galloping()throws InterruptedException{
        mediator.reply(prefix +"galloping: Ready to overtake the sound, good luck!");
        Thread.sleep(1000);
        mediator.reply(prefix +"galloping: FAST!FASTER!FASTEST!!!");
        Thread.sleep(1000);
        mediator.reply(prefix +"galloping: There we are!");
        Thread.sleep(1000);
    }

}
