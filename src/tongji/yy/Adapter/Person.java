package tongji.yy.Adapter;

public class Person implements Oberve {

    private final String name;
    private final PlayDectorator playDectorator;

    public Person(String name, PlayDectorator playDectorator){
        this.name=name;
        this.playDectorator=playDectorator;
    }

    public void registerPerformance(){
        playDectorator.register(PerformanceProxy.class,this);
    }
    public void registerParty(){
        playDectorator.register(PartyProxy.class,this);
    }
    public void registerFinalePerformance(){playDectorator.register(FinalePerformance.class,this);}
    @Override
    public void update(String string) {
        System.out.println();
        System.out.println(string);
        System.out.println();
    }

    @Override
    public String getName(){
        return name;
    }
}
