package tongji.yy.Adapter;

public class PartyAdapter extends PlayDectorator {
    private Party party;

    public PartyAdapter(PlayDectorator playDectorator, Party party){
        super(playDectorator);
        this.party=party;
    }

    @Override
    protected String play0() {
        party.Display();
        return party.getInfo();
    }
    @Override
    protected Class<?> getInfo(){
        return party.getClass();
    }
}
