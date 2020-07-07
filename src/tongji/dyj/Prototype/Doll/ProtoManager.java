package tongji.dyj.Prototype.Doll;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 模型的管理类
 * 只需要一个manager来管理所有的模型，所以采用单例模式
 */
public class ProtoManager {
    private static ProtoManager instance=null;

    //用map来存储prototype和与之对应的key
    private HashMap<String,Doll> dolls=null;

    //私有构造函数
    private ProtoManager(){
        dolls=new HashMap<String, Doll>();
    }
    public static ProtoManager getInstance() {
        if(instance==null)
            instance=new ProtoManager();
        return instance;
    }

    //将已有的doll存储为prototype
    public void rigister(String name,Doll doll) {
        if (doll != null) {
            dolls.put(name, doll);
        }
    }
    //根据key查找对应的prototype，若存在则克隆一个对象
    public Doll create(String name) {
        Doll newDoll=dolls.get(name);
        if(newDoll==null)
            return null;
        return  newDoll.createClone();
    }

    //显示当前存有的所有prototype
    public void showAll()
    {
        System.out.println("ProtoManager : ("+this.hashCode()+"):"+" showAll : "+"现有模板：");
        Iterator iter=dolls.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry entry=(Map.Entry) iter.next();
            Doll doll=(Doll) entry.getValue();
            doll.show();
            System.out.println();
        }
    }
}
