package tongji.yy.Observer;

public class PerformanceImp implements Performance {
    private final String name;
    public PerformanceImp(String name){
        this.name=name;
    }
    @Override
    public void Perform() {
        System.out.println(test.getPrefix(this) +"***************"+this.name+"****************");
    }

    @Override
    public String getInfo() {
        return name;
    }
}
