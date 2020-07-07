package tongji.dyj.Command.Corsair;
/**
 * 海盗船
 * command作用的目标
 * */
public class Corsair {
    private String name="";

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    //构造函数
    public Corsair(){
        this("");
    }
    public Corsair(String name){
        this.name=name;
    }

    public void Fire(){
        System.out.println("Corsair : ("+this.hashCode()+"):"+" Fire : "+name+" Fire！");
    }
    public void TurnLeft(){
        System.out.println("Corsair : ("+this.hashCode()+"):"+" TurnLeft : "+name+" Turn Left");
    }
    public void TurnRight(){
        System.out.println("Corsair : ("+this.hashCode()+"):"+" TurnRight : "+name+" Turn Right");
    }
    public void MoveForward(){
        System.out.println("Corsair : ("+this.hashCode()+"):"+" MoveForward : "+name+" Move Forward");
    }
}
