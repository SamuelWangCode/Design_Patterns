package tongji.yy.Proxy;

public class FinalePerformance extends PlayDectorator {

    public FinalePerformance(){
        super(null);
    }
    @Override
    protected String play0() {
        System.out.println(test.getPrefix(this) + "###############The Finale Performance ############");
        return "FinalePerformance";
    }
    @Override
    protected Class<?> getInfo(){
        return getClass();
    }
}
