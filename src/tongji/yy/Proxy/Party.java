package tongji.yy.Proxy;

public abstract class Party {

    abstract public void Display();
    static public Party newInstance(String addr) {
        return new PartyProxy(addr);
    }
    abstract public String getInfo();
}
