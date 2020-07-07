package tongji.jxh.InterceptingFilter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Visitor {
    String name;
    private List<String> belongings=new ArrayList<>();

    public Visitor(String name){
        this.name=name;
    }

    public void addBelongings(String item){
        belongings.add(item);
    }

    public void removeBelonging(String prohibited){
        Iterator<String> belonging = belongings.iterator();
        while(belonging.hasNext()){
            String item = belonging.next();
            if(item.equals(prohibited)){
                belonging.remove();
            }
        }
    }

    public String getBelongings(){
        String items="";
        for (String item:belongings){
            if(belongings.indexOf(item)!=belongings.size()-1)
                items+=item+",";
            else
                items+=item;
        }
        return items;
    }
}
