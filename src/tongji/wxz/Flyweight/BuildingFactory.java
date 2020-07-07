package tongji.wxz.Flyweight;

import java.util.Hashtable;

/**
 * 建筑工厂类，用于生产建筑，建立享元对象池
 */
public class BuildingFactory {
    private String descStr = "BuildingFactory : (" + this.hashCode() + ") : ";
    //用Hashtable存储对象池
    private Hashtable<String, Building> buildings = new Hashtable<String, Building>();
    //创建静态建筑工厂singleton
    private static BuildingFactory singleton = new BuildingFactory();
    //默认构造函数
    private BuildingFactory(){}
    /**
     * 返回工厂实例
     * @return singleton
     */
    public static BuildingFactory getInstance() {
        return singleton;
    }
    /**
     * 获取一个建筑的实例
     * @param kind 种类
     * @return InstanceOfBuilding
     */
    public synchronized Building get(String kind){
        //如果对象池已存在该对象，直接返回
        Building building = buildings.get(kind);
        //如果找不到，则创建一个新的对象并加入对象池
        if(building==null){
            building=new Building(kind);
            buildings.put(kind, building);
        }
        return building;
    }
    /**
     * 获取对象池中所有对象个数
     * @return 对象池中对象总数
     */
    public void getSize(){
        System.out.println(descStr + "getSize : 现在对象池中对象的个数为: " + buildings.size());
    }
}
