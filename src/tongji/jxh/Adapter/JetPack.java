package tongji.jxh.Adapter;

import java.util.ArrayList;

public class JetPack {
    private String prefix="JetPack ("+this.hashCode()+") : ";
    private ArrayList<PerfectlySeated> passengers=new ArrayList<PerfectlySeated>();

    public JetPack()throws InterruptedException{
        System.out.println(prefix+"Welcome! Take a flight here!");
        Thread.sleep(500);
    }

    public void spiral()throws InterruptedException{
        Thread.sleep(1000);
        System.out.println(prefix+"spiral: Ready to burn up the sky! Let's take off!");
    }

    public void soaring()throws InterruptedException{
        for(int i = 0; i < passengers.size(); i++){
            Thread.sleep(1000);
            passengers.get(i).exclaim();
        }
    }

    public void alight()throws InterruptedException{
        Thread.sleep(1000);
        System.out.println(prefix+"alight: Hilarity's over! See you next time!");
    }

    public int addPassenger(PerfectlySeated passenger) throws InterruptedException{
        passenger.sit();
        passengers.add(passenger);
        return 1;
    }
}
