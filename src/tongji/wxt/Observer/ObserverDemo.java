package tongji.wxt.Observer;

import tongji.wxt.Observer.Bulletin_of_Magic_Show.BulletinBoard;
import tongji.wxt.Observer.Bulletin_of_Magic_Show.InfoPublisher;
import tongji.wxt.Observer.Bulletin_of_Magic_Show.MyObserver;

public class ObserverDemo {
    public static void main(String[] args) {
        test();

    }

    public static void test(){
        InfoPublisher publisher_of_MagicShow = new InfoPublisher();
        int bulletin_number = 1;
        for (int i = 0; i < bulletin_number; i++) {
            publisher_of_MagicShow.addObserver(new BulletinBoard());
        }
        /**也可以用数组进行输入
         * BulletinBoard[] arr = new BulletinBoard[bulletin_number];
         * publisher_of_MagicShow.addObserver(arr);
         */

        String newInfo = "         Surprise!        " +"\n"+"Big Magic Show Will Start at 4:00 P.M!!!  " + "\n"
                + "yzc Will Show You a Magic World !   " +"\n \n";

        String tips = "NEW MAGIC SHOW INFORMATION  " + "\n" + "            YZCHNB !!!       " + "\n";

        publisher_of_MagicShow.changeInfo(newInfo,tips);

    }

}
