package tongji.jxh.Mediator;

public class Human {
    private InteractionMediator mediator;
    private String prefix = "Human (" + this.hashCode()+") : ";

    public Human(InteractionMediator mediator){
        this.mediator=mediator;
        mediator.setHuman(this);
    }

    public void readResponse(String response){
        System.out.println(response);
    }

    public void enter()throws InterruptedException{
        System.out.println(prefix+"enter: High-tech, huh!");
        Thread.sleep(500);
        mediator.greet();
    }

    public void drive(String dest)throws InterruptedException{
        System.out.println(prefix+"drive: Take me to "+dest +".");
        Thread.sleep(500);
        mediator.relay(dest);
    }

    public void leave()throws InterruptedException{
        mediator.farewell();
        System.out.println(prefix+"leave: Cool!!!");
    }
}
