package tongji.yy.DataAccessObject;

public class Demo {
    public static String getPrefix(Object o){
        return o.getClass().getName()+" : ( "+o.hashCode()+" )";
    }
    public static void main(String[] args) {
        test();

    }
    public static void test(){
        //获取 DAO 实现对象
        PersonDao personDao=new PersonDaoImp();
        System.out.println("Demo :( "+Demo.class.hashCode()+" ) Init");
        //通过DAO接口操作对象(update)
        personDao.getAllPerson().forEach((p)-> System.out.println(getPrefix(p)+"Person : "+p.getName()));
        personDao.getAllPerson().get(0).setName("Michael");
        personDao.updatePerson(personDao.getAllPerson().get(0));

        //通过DAO层检查更新后的对象
        System.out.println("Demo :( "+Demo.class.hashCode()+" ) after update\r\n");
        personDao.getAllPerson().forEach((p)-> System.out.println(getPrefix(p)+"Person : "+p.getName()));
    }
}
