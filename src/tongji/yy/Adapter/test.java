package tongji.yy.Adapter;


public class test {
    public static String getPrefix(Object o){
        return o.getClass().getName()+" : ( "+o.hashCode()+" )";
    }
    public static void main(String[] args) {
        test();
    }
    public static void test(){
        //终章    修饰着模式   被修饰对象
        FinalePerformance finale=new FinalePerformance();
        //烟火晚会  修饰者模式 适配器模式  和终章一起组成更大的演出
        Party firwork=Party.newInstance("central park");
        //迪士尼人物巡演  修饰者模式 适配器模式  和终章一起组成更大的演出
        Performance charactertour= Performance.newInstance("Disney character tour");
        //马戏表演  修饰者模式 适配器模式  和终章一起组成更大的演出
        Performance circus= Performance.newInstance("Circus performance");
        //适配器模式   适配Party和Performance到 Play目标
        PlayDectorator playDectorator0=new PartyAdapter(finale,firwork);
        PlayDectorator playDectorator1=new PerformanceAdapter(playDectorator0,charactertour);
        PlayDectorator playDectorator2=new PerformanceAdapter(playDectorator1,circus);
        //观察者模式的观众
        Person peter=new Person("peter",playDectorator2);
        Person tom=new Person("tom",playDectorator1);
        Person lily=new Person("lily",playDectorator0);

        //观众注册监听的事件
        peter.registerParty();
        tom.registerFinalePerformance();
        lily.registerParty();
        lily.registerPerformance();

        //演出开始
        playDectorator2.start();
    }
}
