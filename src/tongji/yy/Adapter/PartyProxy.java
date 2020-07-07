package tongji.yy.Adapter;

public class PartyProxy extends Party {
    private final String addr;
    volatile private Party party;
    public PartyProxy(String addr){
        this.addr=addr;
    }
    @Override
    public void Display() {
        init();
        party.Display();
    }

    @Override
    public String getInfo() {
        //init();
        return "Firework Party on "+addr;
    }

    private void init(){
        if(party==null){
            synchronized (this){
                if (party==null){
                    party=new PartyImp(addr);
                }
            }
        }
    }
}
