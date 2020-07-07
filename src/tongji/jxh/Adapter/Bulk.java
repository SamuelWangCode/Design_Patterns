package tongji.jxh.Adapter;

// The adaptee
public class Bulk {
    private String prefix = "Bulk (" + this.hashCode()+") : ";

    public int rumble(){
        System.out.println(prefix+"rumble: Hum...Pretty cool!");
        return 1;
    }
}
