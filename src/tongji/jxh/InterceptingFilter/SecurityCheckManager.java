package tongji.jxh.InterceptingFilter;

import java.util.ArrayList;
import java.util.List;

public class SecurityCheckManager {
    private Entrance entrance;
    private List<Filter> filterChain=new ArrayList<>();
    private String prefix = "SecurityCheckManager (" + this.hashCode()+") : ";

    private void setEntrance(Entrance entrance) {
        this.entrance = entrance;
    }

    public void addFilter(Filter filter){
        this.filterChain.add(filter);
    }

    public void securityCheck(Visitor visitor)throws InterruptedException{
        System.out.println(prefix+"securityCheck: Security check first, please.");
        Thread.sleep(500);
        for(Filter filter:filterChain){
            filter.execute(visitor);
        }
        System.out.println(prefix+"securityCheck: Alright, "+visitor.name+", Now you are free to enter.");
        Thread.sleep(500);
        System.out.println(prefix+"securityCheck: Always keep an eye on your belongings: "+visitor.getBelongings()+"!");
        Thread.sleep(500);
        entrance.welcome(visitor);
    }

    public SecurityCheckManager(Entrance entrance){
        setEntrance(entrance);
    }
}
