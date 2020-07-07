package tongji.jxh.Adapter;

// The adaptee
public class Miniature {
    private String prefix = "Miniature (" + this.hashCode()+") : ";

    public Miniature(){}

    public int shriek(){
        System.out.println(prefix+"shriek: MY GOD! THAT'S TOO AWWWWWWWESOME!!!");
        return 1;
    }
}
