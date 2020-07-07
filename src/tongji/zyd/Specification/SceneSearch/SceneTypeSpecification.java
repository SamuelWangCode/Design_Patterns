package tongji.zyd.Specification.SceneSearch;

import tongji.zyd.Specification.SceneSearch.CompositeSpecification.CompositeSpecification;
import tongji.zyd.Specification.SceneSearch.SceneInfo;

/**
 * 场景类型规约，继承自CompositeSpecification
 * 泛型参数限制为SceneInfo及其子类
 * @param <T>
 */
class SceneTypeSpecification<T extends SceneInfo>extends CompositeSpecification<T> {
    private SceneInfo.SceneType condition;
    /**
     * 根据传入参数的的场景类型信息判断是否符合要求
     * @param obj
     * @return
     */
    @Override
    public boolean isSatisfiedBy(SceneInfo obj) {
        System.out.println(class_desc+"isSatisfiedBy : 根据场景类型判断结果");
        return obj.getSceneType().equals(condition);
    }
    /**
     * 构造函数，将给定的参数作为isSatisfiedBy的判断依据
     * @param sceneType
     */
    public SceneTypeSpecification(SceneInfo.SceneType sceneType){
        condition=sceneType;
    }
}
