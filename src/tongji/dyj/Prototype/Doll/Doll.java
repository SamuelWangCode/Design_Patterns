package tongji.dyj.Prototype.Doll;

/**
 * 玩偶的基类
 * 每个玩偶有：名称 衣服颜色 大小 价格等基本属性
 */
public abstract class Doll implements Cloneable {
    //玩偶名称
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name=newName;
    }

    //衣服颜色
    private String clothColor;
    public String getClothColor(){return clothColor;}
    public void setClothColor(String newColor){clothColor=newColor;}

    //价格
    private double price;
    public double getPrice(){return price;}
    public void setPrice(double newPrice){price=newPrice;}

    //尺寸
    private String size;
    public String getSize(){return size;}
    public void setSize(String newSize){size=newSize;}

    //显示玩偶的属性
    public void show() {
        System.out.println("Doll : ("+this.hashCode()+"):"+" show : "+"名字：" + name);
        System.out.println("Doll : ("+this.hashCode()+"):"+" show : "+"衣服颜色："+clothColor);
        System.out.println("Doll : ("+this.hashCode()+"):"+" show : "+"尺寸："+size);
        System.out.println("Doll : ("+this.hashCode()+"):"+" show : "+"价格："+price+"$");
    }

    //制作当前玩偶对象的副本
    public Doll createClone() {
        Doll newdoll=null;
        try {
            newdoll= (Doll) this.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return newdoll;
    }
}
