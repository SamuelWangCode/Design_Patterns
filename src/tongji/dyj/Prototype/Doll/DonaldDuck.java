package tongji.dyj.Prototype.Doll;

/**
 * 商店中的唐老鸭玩偶
 * 拥有新的属性帽子颜色
 */
public class DonaldDuck extends Doll {
    //构造函数
    public DonaldDuck() { }

    //帽子颜色
    private String hatColor;
    public String getHatColor(){return hatColor;}
    public void setHatColor(String newHatColor){hatColor=newHatColor;}

    //重写基类的显示函数
    @Override
    public void show()
    {
        System.out.println("DonaldDuck : ("+this.hashCode()+"):"+" show : "+"名字：" + getName());
        System.out.println("DonaldDuck : ("+this.hashCode()+"):"+" show : "+"衣服颜色："+getClothColor());
        System.out.println("DonaldDuck : ("+this.hashCode()+"):"+" show : "+"帽子颜色："+getHatColor());
        System.out.println("DonaldDuck : ("+this.hashCode()+"):"+" show : "+"尺寸："+getSize());
        System.out.println("DonaldDuck : ("+this.hashCode()+"):"+" show : "+"价格："+getPrice()+"$");
    }
}
