package tongji.yzc.FrontController.DisneyServiceCenter.RequestSolvers;

import tongji.yzc.FrontController.DisneyServiceCenter.RequestSolvable;

/**
 * 票务问题请求处理类，实现请求处理器接口。
 */
public class TicketingProblemSolver implements RequestSolvable {
    /**
     * 获得请求类型，实现接口。
     * @return
     */
    @Override
    public String getRequestType() {
        return "TicketingProblem";
    }

    /**
     * 处理请求，实现接口。
     * @param request
     */
    @Override
    public void solveRequest(String request) {
        System.out.println("TicketingProblemSolver : (" + hashCode() + ") solveRequest : 已解决请求：" + request);
    }
}
