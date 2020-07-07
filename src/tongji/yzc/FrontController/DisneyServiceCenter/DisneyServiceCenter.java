package tongji.yzc.FrontController.DisneyServiceCenter;

/**
 * 前端控制器的最顶级类，是用户使用界面。
 * 本例中，我们将迪士尼的服务中心作为前端控制器，
 * 游客向迪士尼服务中心发出一些请求，之后我们将请求用我们的
 * 请求调度器调度给相应的请求处理器来解决问题。
 * 并且我们能够记录下所有的请求，实现日志的功能。
 */
public class DisneyServiceCenter {
    private RequestDispatcher dispatcher = new RequestDispatcher();

    /**
     * 记录请求，实现日志功能。
     * @param requestType
     * @param requestContent
     */
    private void trackRequest(String requestType, String requestContent){
        System.out.println(descStr + "trackRequest : 记录下请求，请求种类：" + requestType + "，请求内容：" + requestContent);
    }

    /**
     * 分配请求，唯一的共有函数，是所有外界游客使用它的入口。
     * 只要向它提供请求的类型以及请求的内容，它会调用调度器来找到合适的请求处理器，
     * 之后用它来解决游客的问题。
     * @param requestType
     * @param requestContent
     */
    public void dispatchRequest(String requestType, String requestContent){
        trackRequest(requestType, requestContent);
        dispatcher.dispatch(requestType, requestContent);
    }

    private String descStr = "DisneyServiceCenter : (" + hashCode() + ") : ";
}
