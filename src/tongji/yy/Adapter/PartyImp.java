package tongji.yy.Adapter;

public class PartyImp extends Party {

    private final String addr;
    public PartyImp(String str){
        addr=str;
    }
    @Override
    public void Display() {
        System.out.println(test.getPrefix(this) +"------------------The fireworks party on the"+addr+"----------------");
    }

    @Override
    public String getInfo() {
        return addr;
    }
}
