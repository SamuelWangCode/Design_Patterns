package tongji.zyd.Specification.SceneSearch.CompositeSpecification;

/**
 * 抽象基类，组合规约
 * 用于生成多种逻辑谓词结合的规约
 * @param <T>
 */
public abstract class CompositeSpecification<T> {
    protected String class_desc=this.getClass().getSimpleName()+" : ("+this.hashCode()+") : ";

    /**
     * 抽象函数，用于判断传入参数obj是否符合要求，由子类实现
     * @param obj
     * @return
     */
    public abstract boolean isSatisfiedBy(T obj);

    /**
     * 返回and运算下生成的新的规约，自身不改变
     * @param specification
     * @return
     */
    final public CompositeSpecification<T> and(CompositeSpecification specification){
        System.out.println(class_desc+"and : 对规约进行与运算");
        return new AndSpecification<T>(this,specification);
    }

    /**
     * 返回or运算下生成的新的规约，自身不改变
     * @param specification
     * @return
     */
    final public CompositeSpecification<T> or(CompositeSpecification specification){
        System.out.println(class_desc+"or : 对规约进行或运算");
        return new OrSpecification<T>(this,specification);
    }

    /**
     * 返回not运算下生成的新的规约，自身不改变
     * @return
     */
    final public CompositeSpecification<T> not(){
        System.out.println(class_desc+"not : 对规约进行非运算");
        return new NotSpecification<T>(this);
    }
}
