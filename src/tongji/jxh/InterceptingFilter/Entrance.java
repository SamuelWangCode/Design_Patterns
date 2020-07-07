package tongji.jxh.InterceptingFilter;

public class Entrance {
    private String prefix = "Entrance (" + this.hashCode()+") : ";

    public void welcome(Visitor visitor){
        System.out.println(prefix+"welcome: Welcome to the DisneyLand! Enjoy yourself!");
    }
}
