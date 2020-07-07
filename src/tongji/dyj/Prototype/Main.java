package tongji.dyj.Prototype;

import tongji.dyj.Prototype.Doll.*;

/**
 * ProtoType模式
 * 应用场景：迪士尼玩偶商店
 * 商店中有几种固定类型的玩偶：小号唐老鸭/大号唐老鸭...
 * 将这几种固定类型的玩偶作为prototype
 * 当有新的玩偶推出时，可以直接获取玩偶的模板对其进行修改
 */
public class Main {

    public static void main(String[] args) { test(); }

    public static void test(){
        System.out.println("迪士尼乐园玩偶商店：");
        //预制几种模板玩偶
        DonaldDuck duck1=new DonaldDuck();
        duck1.setName("小号唐老鸭");
        duck1.setClothColor("蓝色");
        duck1.setHatColor("蓝色");
        duck1.setPrice(25);
        duck1.setSize("小号");

        DonaldDuck duck2=new DonaldDuck();
        duck2.setName("大号唐老鸭");
        duck2.setClothColor("蓝色");
        duck2.setHatColor("蓝色");
        duck2.setPrice(50);
        duck2.setSize("大号");

        MickeyMouse mouse1=new MickeyMouse();
        mouse1.setName("小号米老鼠");
        mouse1.setClothColor("红色");
        mouse1.setPrice(30);
        mouse1.setSize("小号");
        mouse1.setLyric("我是一只小号米老鼠");

        MickeyMouse mouse2=new MickeyMouse();
        mouse2.setName("大号米老鼠");
        mouse2.setClothColor("红色");
        mouse2.setPrice(60);
        mouse2.setSize("大号");
        mouse2.setLyric("我是一只大号米老鼠");

        ProtoManager.getInstance().rigister("小号唐老鸭",duck1);
        ProtoManager.getInstance().rigister("大号唐老鸭",duck2);
        ProtoManager.getInstance().rigister("小号米老鼠",mouse1);
        ProtoManager.getInstance().rigister("大号米老鼠",mouse2);
        ProtoManager.getInstance().showAll();

        //商店想新出一种黑色衣服黑色帽子的小号唐老鸭
        System.out.println("商店新品:");
        DonaldDuck newDuck=(DonaldDuck)ProtoManager.getInstance().create("小号唐老鸭");
        if(newDuck!=null) {
            newDuck.setName("黑色小号唐老鸭");
            newDuck.setClothColor("黑色");
            newDuck.setHatColor("黑色");
            newDuck.show();
        }
        System.out.println("");
        MickeyMouse newMouse=(MickeyMouse)ProtoManager.getInstance().create("大号米老鼠");
        if(newMouse!=null){
            newMouse.setLyric("嘤嘤嘤");
            newMouse.setPrice(50);
            newMouse.show();
            newMouse.sing();
        }
    }
}
