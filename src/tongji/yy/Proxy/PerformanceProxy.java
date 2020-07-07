package tongji.yy.Proxy;

public class PerformanceProxy implements Performance {
    volatile private Performance performance;
    final private String name;
    public PerformanceProxy(String str){
        this.name=str;
    }
    @Override
    public void Perform() {
        init();
        performance.Perform();
    }

    @Override
    public String getInfo() {
        //init();
        return name;
    }

    private void init(){
        if(performance==null){
            synchronized (this){
                if(performance==null) {
                    performance = new PerformanceImp(name);
                }
            }
        }
    }

}
