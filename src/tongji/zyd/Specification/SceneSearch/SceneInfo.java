package tongji.zyd.Specification.SceneSearch;

/**
 * 场景信息类，用于存放场景的信息
 */
public class SceneInfo {
    /**
     * 场景所在园区信息的枚举
     */
    public enum LocationType {
        Mickey_Avenue,
        Gardens_of_Imagination,
        Fantasy_Land,
        Toy_Story_Land,
        Adventure_Isle,
        Treasure_Cove,
        Tomorrow_land;

        /**
         * 根据枚举的类型返回场景所在的园区名
         * @return
         */
        public String getLocationStr() {
            return this.name().replace('_', ' ');
        }
    }

    /**
     * 场景类型的枚举
     */
    public enum SceneType {
        Shopping,
        Dinning,
        Entertainment,
        Attraction;

        /**
         * 根据枚举的类型返回场景所属的类型
         * @return
         */
        public String getSceneTypeStr() {
            return this.name();
        }
    }

    private String name;
    private LocationType locationType;
    private SceneType sceneType;

    /**
     * 构造函数，接受三个参数来创建场景信息
     * @param name
     * @param locationType
     * @param sceneType
     */
    public SceneInfo(String name,LocationType locationType,SceneType sceneType){
        this.name=name;
        this.locationType=locationType;
        this.sceneType=sceneType;
    }

    /**
     * 获取场景名字
     * @return
     */
    public String getName(){
        return name;
    }

    /**
     * 获取场景所在乐园的信息
     * @return
     */
    public LocationType getLocation(){
        return locationType;
    }

    /**
     * 获取场景类型信息
     * @return
     */
    public SceneType getSceneType(){
        return sceneType;
    }
};
