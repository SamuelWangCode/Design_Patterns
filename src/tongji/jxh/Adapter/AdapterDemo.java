package tongji.jxh.Adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        try {
            test();
        }
        catch (InterruptedException e){
            System.out.println("Main: main: Game is terminated...");
        }
    }

    public static void test() throws InterruptedException{
        System.out.println("开始测试Adapter 作者：江宵汉");

        JetPack jetPackCraft =new JetPack();

        Normal passenger1=new Normal();

        Miniature kid=new Miniature();
        TightlyFastened passenger2=new TightlyFastened(kid);

        Bulk bigMan=new Bulk();
        LooselyFastened passenger3=new LooselyFastened(bigMan);

        jetPackCraft.addPassenger(passenger1);
        jetPackCraft.addPassenger(passenger2);
        jetPackCraft.addPassenger(passenger3);

        jetPackCraft.spiral();
        jetPackCraft.soaring();
        jetPackCraft.alight();

    }
}
