package tongji.jxh.InterceptingFilter;

public interface Filter {
    void execute(Visitor visitor) throws InterruptedException;
}
