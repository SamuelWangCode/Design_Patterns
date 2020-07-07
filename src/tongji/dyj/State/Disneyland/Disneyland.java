package tongji.dyj.State.Disneyland;

/**
 *  迪士尼乐园类
 *  有游客数和当前状态两个属性
 *  游客入园/出园时执行当前状态的入园/出园操作
 */
public class Disneyland {
    //构造函数
    public Disneyland(){
        visitorNum=0;
        currentState=EmptyState.getInstance();
    }
    //游客数
    private int visitorNum;
    public int getVisitorNum(){
        return visitorNum;
    }
    //当前状态
    private State currentState;
    //根据当前状态执行游客入园
    public void peopleEnter(){
        ++visitorNum;
        if(currentState!=null){
            currentState.peopleEnter(this);
        }
    }
    //根据当前状态执行游客出园
    public void peopleOut(){
        if(visitorNum<=0){
            System.out.println("当前园中没人");
            return;
        }
        --visitorNum;
        if(currentState!=null){
            currentState.peopleOut(this);
        }
    }
    //更改当前状态
    public void setState(State state){
        if(state!=null&&state!=currentState){
            currentState=state;
        }
    }

}
