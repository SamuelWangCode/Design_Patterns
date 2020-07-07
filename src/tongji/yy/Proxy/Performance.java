package tongji.yy.Proxy;

public interface Performance {
    void Perform();
    static Performance newInstance(String string){
        return new PerformanceProxy(string);
    }
    String getInfo();
}
