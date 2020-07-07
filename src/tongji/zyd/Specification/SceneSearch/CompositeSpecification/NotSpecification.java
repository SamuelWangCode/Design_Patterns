package tongji.zyd.Specification.SceneSearch.CompositeSpecification;

/**
 * Not规约类，继承自CompositeSpecification
 * 持有一个规约类，实现该规约的not运算
 * @param <T>
 */
class NotSpecification<T> extends CompositeSpecification<T> {
    private CompositeSpecification spec;

    /**
     * 构造函数，接受一个规约类作为参数
     * @param specification
     */
    public NotSpecification(CompositeSpecification specification) {
        spec=specification;
    }

    /**
     * 用于判断传入参数obj是否符合要求
     * 返回持有规约类对调用isSatisfiedBy方法后再进行not运算的结果
     * @param obj
     * @return
     */
    @Override
    public boolean isSatisfiedBy(T obj) {
        System.out.println(class_desc+"isSatisfiedBy : 返回非运算判断结果");
        if(spec==null){
            return false;
        }
        return !spec.isSatisfiedBy(obj);
    }

}
