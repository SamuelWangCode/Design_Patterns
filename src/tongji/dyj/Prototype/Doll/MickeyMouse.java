package tongji.dyj.Prototype.Doll;

/**
 * 商店里的米老鼠玩偶
 * 拥有新的方法 唱歌
 */
public class MickeyMouse extends Doll {
    //构造函数
    public MickeyMouse(){
    }
    //歌词
    private String lyric;
    public void setLyric(String newLyric) {
        lyric=newLyric;
    }
    //唱歌
    public void sing(){
        System.out.println("MickeyMouse : ("+this.hashCode()+"):"+" sing : "+"米老鼠在唱歌："+lyric);
    }
}
