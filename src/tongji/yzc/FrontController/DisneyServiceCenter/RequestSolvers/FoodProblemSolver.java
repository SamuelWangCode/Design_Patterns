package tongji.yzc.FrontController.DisneyServiceCenter.RequestSolvers;

import tongji.yzc.FrontController.DisneyServiceCenter.RequestSolvable;

/**
 * 食物问题请求处理类，实现了请求处理器的接口
 */
public class FoodProblemSolver implements RequestSolvable {
    /**
     * 实现接口，获得请求类型。
     * @return
     */
    @Override
    public String getRequestType() {
        return "FoodProblem";
    }

    /**
     * 实现接口，解决请求。
     * @param request
     */
    @Override
    public void solveRequest(String request) {
        System.out.println("FoodProblemSolver : (" + hashCode() + ") solveRequest : 已解决请求：" + request);
    }
}
