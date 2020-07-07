package tongji.zyd.Specification.SceneSearch.CompositeSpecification;

/**
 * Or规约类，继承自CompositeSpecification
 * 持有两个规约类，用于计算这两个规约or运算后的结果
 * @param <T>
 */
class OrSpecification<T> extends CompositeSpecification<T> {
    private CompositeSpecification one;
    private CompositeSpecification other;

    /**
     * 构造函数，接受两个规约类作为参数
     * @param specification
     * @param specification1
     */
    public OrSpecification(CompositeSpecification specification, CompositeSpecification specification1) {
        one=specification;
        other=specification1;
    }

    /**
     * 用于判断传入参数obj是否符合要求
     * 返回对持有的两个规约类调用isSatisfiedBy方法后进行or运算的结果
     * @param obj
     * @return
     */
    @Override
    public boolean isSatisfiedBy(Object obj) {
        System.out.println(class_desc+"isSatisfiedBy : 返回或运算判断结果");
        boolean re=false;
        if(one!=null){
            re=one.isSatisfiedBy(obj);
        }
        if(other!=null){
            re|=other.isSatisfiedBy(obj);
        }
        return re;
    }
}
