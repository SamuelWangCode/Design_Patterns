package tongji.yy.Observer;

public interface Performance {
    void Perform();
    static Performance newInstance(String string){
        return new PerformanceProxy(string);
    }
    String getInfo();
}
