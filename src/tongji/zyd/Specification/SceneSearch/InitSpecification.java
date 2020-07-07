package tongji.zyd.Specification.SceneSearch;

import tongji.zyd.Specification.SceneSearch.CompositeSpecification.CompositeSpecification;
import tongji.zyd.Specification.SceneSearch.SceneInfo;

/**
 * 默认规约，用于初始化时使用
 * 继承自CompositeSpecification
 * 泛型参数限制为SceneInfo及其子类
 * @param <T>
 */
class InitSpecification<T extends SceneInfo> extends CompositeSpecification<T> {
    /**
     * 对所有传入参数都返回true
     * 故可以实现全选功能
     * @param obj
     * @return
     */
    @Override
    public boolean isSatisfiedBy(SceneInfo obj) {
        System.out.println(class_desc+"isSatisfiedBy : 进行默认判断(始终返回true)");
        return true;
    }
}
