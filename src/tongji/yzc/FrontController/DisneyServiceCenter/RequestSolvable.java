package tongji.yzc.FrontController.DisneyServiceCenter;

/**
 * 请求处理器的接口。它们都具有一个处理请求的方法，
 * 并且可以获得它自身的请求种类。
 */
public interface RequestSolvable {
    /**
     * 解决实际请求。
     * @param request
     */
    void solveRequest(String request);

    /**
     * 获取自身的请求类型。
     * @return
     */
    String getRequestType();
}
