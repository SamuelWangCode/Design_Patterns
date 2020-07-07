package tongji.yzc.TemplateMethod;

import tongji.yzc.TemplateMethod.StageShow.ConcreteMagicShow;
import tongji.yzc.TemplateMethod.StageShow.StageShowTemplate;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        System.out.println("欢迎来到迪士尼舞台表演秀！");
        StageShowTemplate concreteMagicShow = new ConcreteMagicShow("whateverName", "whateverTools");
        try{
            concreteMagicShow.show();
        }catch (InterruptedException e){
            System.out.println("Test : main : 表演被终止.");
        }
    }
}
