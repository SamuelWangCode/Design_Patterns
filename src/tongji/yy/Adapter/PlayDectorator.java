package tongji.yy.Adapter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

abstract public class PlayDectorator implements Play {
    private static final Map<Class<?>, Set<Oberve>> mp=new HashMap<>();
    protected int order;
    private final PlayDectorator previous;

    PlayDectorator(PlayDectorator pre) {

        this.previous=pre;
    }
    public void register(Class<?> clazz, Oberve oberve){
        //System.out.println(oberve.getName()+" register ");
        //System.out.println("register "+clazz.getName());
            if(!mp.containsKey(clazz)){
                mp.put(clazz,new HashSet<>());
            }
            mp.get(clazz).add(oberve);
            //mp.put(clazz, oberve);

    }

    @Override
    public final void play(){
        String message=" Come On!  Order "+order+" :"+play0()+"is started";

        notify0(getInfo(),message);
        try{
            TimeUnit.SECONDS.sleep(2);
        }catch (Exception e){
            e.printStackTrace();
        }

        if(previous!=null){
            previous.setOrder(order+1);
            previous.play();
        }


    }

    protected Class<?> getInfo(){
        return PlayDectorator.class;
    }
    public void start(){
        this.order=1;
        play();
    }
    private void setOrder(int order){
        this.order=order;
    }

    private void notify0(Class<?> clazz,String string){
        //System.out.println("notify "+clazz.getName());
        //System.out.println(mp.size());
        Set<Oberve> so=mp.get(clazz);
        if(so==null)return;
        //System.out.println("-----------test-----------------");
        for (Oberve o:so) {
            o.update(test.getPrefix(this) +o.getName()+" please! "+string);
        }
    }
    abstract protected String play0();
}
