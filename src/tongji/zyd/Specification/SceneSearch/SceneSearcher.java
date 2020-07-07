package tongji.zyd.Specification.SceneSearch;

import tongji.zyd.Specification.SceneSearch.CompositeSpecification.CompositeSpecification;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 游乐园场景搜索类，用于给游客提供搜索服务
 * 根据游客给定的条件，检索出相应的游乐园场景
 */
public class SceneSearcher {
    static {
        SceneSearcher.sceneList = new ArrayList<>();
        SceneSearcher.sceneList.addAll(Arrays.asList(new SceneInfo("Avenue M Arcade", SceneInfo.LocationType.Mickey_Avenue, SceneInfo.SceneType.Shopping),
                new SceneInfo("Pinocchio Village Kitchen", SceneInfo.LocationType.Fantasy_Land, SceneInfo.SceneType.Dinning),
                new SceneInfo("Stargazer Grill", SceneInfo.LocationType.Tomorrow_land, SceneInfo.SceneType.Dinning),
                new SceneInfo("Meet Miguel", SceneInfo.LocationType.Adventure_Isle, SceneInfo.SceneType.Entertainment),
                new SceneInfo("Golden Fairytale Fanfare", SceneInfo.LocationType.Gardens_of_Imagination, SceneInfo.SceneType.Entertainment),
                new SceneInfo("Slinky Dog Spin", SceneInfo.LocationType.Toy_Story_Land, SceneInfo.SceneType.Attraction),
                new SceneInfo("Explorer Canoes", SceneInfo.LocationType.Treasure_Cove, SceneInfo.SceneType.Attraction),
                new SceneInfo("Mickey’s Film Festival", SceneInfo.LocationType.Mickey_Avenue, SceneInfo.SceneType.Attraction)));
    }
    private String class_desc="SceneSearcher : ("+this.hashCode()+") : ";
    /**
     * 创建一个位置规约，用于通过场景位置搜索场景
     * @param locationType
     * @return
     */
    static public LocationSpecification<SceneInfo> createLocationSpecification(SceneInfo.LocationType locationType) {
        return new LocationSpecification<>(locationType);
    }

    /**
     * 创建一个场景类型规约，用于通过场景类型搜索场景
     * @param sceneType
     * @return
     */
    static public SceneTypeSpecification<SceneInfo> createSceneTypeSpecification(SceneInfo.SceneType sceneType) {
        return new SceneTypeSpecification<>(sceneType);
    }

    /**
     * 根据设置的规约条件得到符号要求的场景列表
     * @return
     */
    public ArrayList<SceneInfo> getResult() {
        System.out.println(class_desc+"getResult : 获取搜索结果");
        ArrayList<SceneInfo> re = new ArrayList<>();
        for (SceneInfo i : SceneSearcher.sceneList) {
            if (specification.isSatisfiedBy(i)) {
                re.add(i);
            }
        }
        return re;
    }

    /**
     * 构造函数
     */
    public SceneSearcher() {
        specification = new InitSpecification<>();

    }


    /**
     * 设置用于搜索场景的规约信息
     * @param specification
     */
    public void setSpecification(CompositeSpecification<SceneInfo> specification) {
        System.out.println(class_desc+"setSpecification : 设置使用的搜索规约条件");
        this.specification = specification;
    }

    /**
     * 清空搜索条件
     */
    public void clear() {
        System.out.println(class_desc+"clear : 清空添加的搜索条件");
        this.specification = new InitSpecification<>();
    }

    private CompositeSpecification<SceneInfo> specification;
    static private ArrayList<SceneInfo> sceneList;
}
