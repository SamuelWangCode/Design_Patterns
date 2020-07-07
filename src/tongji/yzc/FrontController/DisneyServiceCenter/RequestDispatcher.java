package tongji.yzc.FrontController.DisneyServiceCenter;

import tongji.yzc.FrontController.DisneyServiceCenter.RequestSolvers.FacilityProblemSolver;
import tongji.yzc.FrontController.DisneyServiceCenter.RequestSolvers.FoodProblemSolver;
import tongji.yzc.FrontController.DisneyServiceCenter.RequestSolvers.TicketingProblemSolver;

import java.util.ArrayList;

/**
 * 前端控制器中的分发器，是模式中非常重要的一环。
 * 它负责将前端控制器收到的请求分发给我们所有已知的请求处理器。
 * 在成熟的框架中，处理器是通过注册机制，注册到分发器中来的。
 * 在本例中，我们简单的自己写出来即可。
 */
public class RequestDispatcher {
    /**
     * 在本地变量中存储了全部的请求处理器。
     */
    private ArrayList<RequestSolvable> solvers;

    /**
     * 构造函数，将所有的请求处理器加入到本地存储中。
     */
    public RequestDispatcher(){
        solvers = new ArrayList<>();
        solvers.add(new FacilityProblemSolver());
        solvers.add(new FoodProblemSolver());
        solvers.add(new TicketingProblemSolver());
    }

    /**
     * 分配器主函数。
     * 它负责根据对应请求的种类，
     * 找到合适的处理器，并将请求转交给它来进行处理。
     * @param requestType
     * @param requestContent
     */
    public void dispatch(String requestType, String requestContent){
        for (RequestSolvable solver : solvers) {
            if(solver.getRequestType().equals(requestType)){
                solver.solveRequest(requestContent);
                return;
            }
        }
        System.out.println("RequestDispatcher (" + hashCode() + ") dispatch : 分配失败，没有找到合适的请求解决者。");
    }
}
