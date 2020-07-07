package tongji.zyd.Specification;

import tongji.zyd.Specification.SceneSearch.CompositeSpecification.CompositeSpecification;
import tongji.zyd.Specification.SceneSearch.SceneInfo;
import tongji.zyd.Specification.SceneSearch.SceneSearcher;

import java.util.ArrayList;

public class TestSceneSearcher {
    static public void main(String argv[]){
        test();
    }
    public static void test() {
        SceneSearcher sceneSearcher = new SceneSearcher();
        System.out.println("欢迎使用游乐园搜索工具");

        System.out.println("情况0：全选");
        printResult(sceneSearcher.getResult());

        System.out.println("情况1：只使用一种规约");
        System.out.println("选择位于Mickey Avenue的场景");
        CompositeSpecification<SceneInfo> spec = SceneSearcher.createLocationSpecification(SceneInfo.LocationType.Mickey_Avenue);
        sceneSearcher.setSpecification(spec);
        printResult(sceneSearcher.getResult());
        System.out.println("选择场景类型为Entertainment的场景");
        spec = SceneSearcher.createSceneTypeSpecification(SceneInfo.SceneType.Entertainment);
        sceneSearcher.setSpecification(spec);
        printResult(sceneSearcher.getResult());

        System.out.println("情况2：使用And连接两种规约");
        System.out.println("选择位于Fantasy Land且场景类型为Dinning的场景");
        spec = SceneSearcher.createSceneTypeSpecification(SceneInfo.SceneType.Dinning);
        spec = spec.and(SceneSearcher.createLocationSpecification(SceneInfo.LocationType.Fantasy_Land));
        sceneSearcher.setSpecification(spec);
        printResult(sceneSearcher.getResult());

        System.out.println("情况3：使用Or连接两种规约");
        System.out.println("选择位于Adventure Isle或场景类型为Shopping的场景");
        spec = SceneSearcher.createSceneTypeSpecification(SceneInfo.SceneType.Shopping);
        spec = spec.or(SceneSearcher.createLocationSpecification(SceneInfo.LocationType.Adventure_Isle));
        sceneSearcher.setSpecification(spec);
        printResult(sceneSearcher.getResult());

        System.out.println("情况4：使用Not进行反选");
        System.out.println("选择不位于Gardens of Imagination的场景");
        spec = SceneSearcher.createLocationSpecification(SceneInfo.LocationType.Gardens_of_Imagination);
        spec = spec.not();
        sceneSearcher.setSpecification(spec);
        printResult(sceneSearcher.getResult());

        System.out.println("情况5：使用多种连接谓词进行选择");
        System.out.println("选择场景类型为Attraction且不位于Toy Story Land或Mickey Avenue");
        spec = SceneSearcher.createLocationSpecification(SceneInfo.LocationType.Toy_Story_Land);
        spec = spec.or(SceneSearcher.createLocationSpecification(SceneInfo.LocationType.Mickey_Avenue));
        spec = spec.not();
        spec = spec.and(SceneSearcher.createSceneTypeSpecification(SceneInfo.SceneType.Attraction));
        sceneSearcher.setSpecification(spec);
        printResult(sceneSearcher.getResult());
    }

    static private void printResult(ArrayList<SceneInfo> list) {
        System.out.println("输出搜索结果");
        System.out.println("Total " + list.size() + " Scenes");
        for (int i = 1; i <= list.size(); ++i) {
            SceneInfo info = list.get(i - 1);
            System.out.println("Scene"+ i + ":");
            System.out.println("Scene Name:\t" + info.getName());
            System.out.println("Scene Location:\t" + info.getLocation().getLocationStr());
            System.out.println("Scene Type:\t" + info.getSceneType().getSceneTypeStr());
        }
        System.out.println();
    }

}
