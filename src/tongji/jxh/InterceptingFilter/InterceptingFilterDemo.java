package tongji.jxh.InterceptingFilter;

public class InterceptingFilterDemo {
    public static void main(String[] args) {
        try {
            test();
        }
        catch (InterruptedException e){
            System.out.println("Main: main: Security check is aborted...");
        }
    }

    public static void test() throws InterruptedException{
        System.out.println("开始测试InterceptingFilter 作者：江宵汉");

        SecurityCheckManager manager=new SecurityCheckManager(new Entrance());
        manager.addFilter(new CombustibleFilter());
        manager.addFilter(new PetFilter());

        Visitor visitor=new Visitor("Sony");
        visitor.addBelongings("pet");
        visitor.addBelongings("combustible");
        visitor.addBelongings("phone");

        Gate gate=new Gate();
        gate.setManager(manager);
        gate.sendVisitor(visitor);
    }
}
