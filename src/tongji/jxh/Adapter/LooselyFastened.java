package tongji.jxh.Adapter;

// Serve as the Adapter of the class "Bulk"
public class LooselyFastened implements PerfectlySeated {
    private Bulk figure;
    private String prefix = "LooselyFastened (" + this.hashCode()+") : ";

    LooselyFastened(Bulk figure){
        this.figure=figure;
    }

    @Override
    public int sit() throws InterruptedException{
        System.out.println(prefix+"sit: Loosely but safely fastened");
        Thread.sleep(1000);
        return 1;
    }

    @Override
    public int exclaim(){
        return figure.rumble();
    }
}
