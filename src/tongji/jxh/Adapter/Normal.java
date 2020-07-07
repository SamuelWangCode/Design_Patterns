package tongji.jxh.Adapter;

public class Normal implements PerfectlySeated {
    private String prefix = "Normal (" + this.hashCode()+") : ";

    public Normal(){}

    @Override
    public int sit() throws InterruptedException {
        System.out.println(prefix+"sit: Safely fastened");
        Thread.sleep(1000);
        return 1;
    }

    public int exclaim() {
        System.out.println(prefix+"exclaim: Wow! It's rather amazing!");
        return 1;
    }
}
