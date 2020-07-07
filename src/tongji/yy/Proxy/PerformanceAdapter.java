package tongji.yy.Proxy;

public class PerformanceAdapter extends PlayDectorator {
    private Performance performance;
    public PerformanceAdapter(PlayDectorator pre, Performance performance){
        super(pre);
        this.performance=performance;
    }

    @Override
    protected String play0() {
        performance.Perform();
        return performance.getInfo();
    }
    @Override
    protected Class<?> getInfo(){
        return performance.getClass();
    }
}
