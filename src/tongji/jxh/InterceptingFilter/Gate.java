package tongji.jxh.InterceptingFilter;

public class Gate {
    private SecurityCheckManager manager;
    private String prefix = "Gate (" + this.hashCode()+") : ";

    public void setManager(SecurityCheckManager manager) {
        this.manager = manager;
    }

    public void sendVisitor(Visitor visitor) throws InterruptedException{
        System.out.println(prefix+"sendVisitor: A visitor named " +visitor.name+" is coming with items: "+visitor.getBelongings()+".");
        Thread.sleep(1000);
        manager.securityCheck(visitor);
    }
}
