package tongji.dyj.State;

import tongji.dyj.State.Disneyland.Disneyland;

/**
 * State模式
 * 使用场景：迪士尼乐园根据当前园中人数调整状态
 * 人数 0~10人为淡季  11~20人为常规  21以上为旺季
 * 不同的状态票价不同
 */
public class Main {

    public static void main(String[] args) { test();}

    public static void test(){
        System.out.println("迪士尼乐园人数状态以及对应的票务方案：");
        Disneyland disneyland = new Disneyland();
        for (int i = 0; i < 30; ++i) {
            disneyland.peopleEnter();
        }
        for (int i = 0; i < 31; ++i) {
            disneyland.peopleOut();
        }
    }
}
