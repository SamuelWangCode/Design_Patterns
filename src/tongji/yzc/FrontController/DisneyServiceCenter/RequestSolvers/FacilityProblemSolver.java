package tongji.yzc.FrontController.DisneyServiceCenter.RequestSolvers;

import tongji.yzc.FrontController.DisneyServiceCenter.RequestSolvable;

/**
 * 游玩设施问题请求处理器。它实现了请求处理器接口。
 */
public class FacilityProblemSolver implements RequestSolvable {
    /**
     * 实现的接口中的方法，获得自身的请求种类
     * @return
     */
    @Override
    public String getRequestType() {
        return "FacilityProblem";
    }

    /**
     * 实现接口中解决请求的方法。
     * @param request
     */
    @Override
    public void solveRequest(String request) {
        System.out.println("FacilityProblemSolver : (" + hashCode() + ") solveRequest : 已解决请求：" + request);
    }
}
