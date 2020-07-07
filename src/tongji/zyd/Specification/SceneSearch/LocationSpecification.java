package tongji.zyd.Specification.SceneSearch;

import tongji.zyd.Specification.SceneSearch.CompositeSpecification.CompositeSpecification;

/**
 * 场景位置规约，继承自CompositeSpecification
 * 泛型参数限制为SceneInfo及其子类
 * @param <T>
 */
class LocationSpecification<T extends SceneInfo> extends CompositeSpecification<T> {
    private SceneInfo.LocationType condition;

    /**
     * 根据传入参数的的位置信息判断是否符合要求
     * @param obj
     * @return
     */
    @Override
    public boolean isSatisfiedBy(SceneInfo obj) {
        System.out.println(class_desc+"isSatisfiedBy : 根据场景位置判断结果");
        return obj.getLocation().equals(condition);
    }

    /**
     * 构造函数，将给定的参数作为isSatisfiedBy的判断依据
     * @param locationType
     */
    public LocationSpecification(SceneInfo.LocationType locationType){
        condition=locationType;
    }
}
