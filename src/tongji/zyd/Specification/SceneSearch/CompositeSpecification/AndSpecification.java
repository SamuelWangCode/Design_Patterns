package tongji.zyd.Specification.SceneSearch.CompositeSpecification;

/**
 * And规约，继承自CompositeSpecification
 * 持有两个规约类，用于实现两个规约的and运算
 * @param <T>
 */
class AndSpecification<T> extends CompositeSpecification<T> {
    private CompositeSpecification one;
    private CompositeSpecification other;

    /**
     * 构造函数，接受两个规约类作为参数
     * @param specification
     * @param specification1
     */
    public AndSpecification(CompositeSpecification specification, CompositeSpecification specification1) {
        one=specification;
        other=specification1;
    }

    /**
     * 用于判断传入参数obj是否符合要求
     * 使用传入参数obj调用持有的两个规约类的isSatisfiedBy方法
     * 并对它们的判断结果进行and运算后返回
     * @param obj
     * @return
     */
    @Override
    public boolean isSatisfiedBy(T obj) {
        if(one==null||other==null){
            return false;
        }
        System.out.println(class_desc+"isSatisfiedBy : 返回与运算判断结果");
        return one.isSatisfiedBy(obj)&&other.isSatisfiedBy(obj);
    }
}
