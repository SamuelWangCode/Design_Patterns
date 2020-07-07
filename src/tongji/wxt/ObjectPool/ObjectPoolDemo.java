package tongji.wxt.ObjectPool;

import tongji.wxt.ObjectPool.GreenChannel.Client;

public class ObjectPoolDemo {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        Client client = new Client();
        for (int i = 1; i <6 ; i++) {

            client.applyChannel();
        }
        //对象池中共有5个对象，因此第六次申请被延迟

        client.applyChannel();
        //归还一个对象后，可继续申请

        client.PopChannel();


        client.applyChannel();
    }

}
