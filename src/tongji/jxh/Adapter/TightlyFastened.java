package tongji.jxh.Adapter;

// Serve as the Adapter of the class "Miniature"
public class TightlyFastened implements PerfectlySeated {
    private Miniature figure;
    private String prefix = "TightlyFastened (" + this.hashCode()+") : ";

    public TightlyFastened(Miniature figure){
        this.figure=figure;
    }

    @Override
    public int sit() throws InterruptedException{
        System.out.println(prefix+"sit: Tightly while safely fastened");
        Thread.sleep(1000);
        return 1;
    }

    @Override
    public int exclaim(){
        return figure.shriek();
    }
}
