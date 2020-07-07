package tongji.ljn.InterfaceFluent;

import java.nio.file.FileSystemNotFoundException;

/**
 *运用Interface Fluent设计模式
 *使得注册会员和查看会员信息更加人性化。更加优雅
 */

public class InterfaceFluentDemo {
    public static void main(String[] args){test();}
    public static void test(){
        System.out.println("欢迎注册迪士尼尊享会员！");
        InterfaceFluent interfaceFluent = new InterfaceFluent();
        interfaceFluent
                .setAddress("上海市嘉定区曹安公路4800号同济大学")
                .setAge(18)
                .setGender("男")
                .setIsMarried(false)
                .setName("紫超哥哥")
                .setTelephone("8008208820")
                .setBirthday("2000/2/14");

        System.out.println("欢迎查看会员信息~");
        interfaceFluent
                .getName()
                .getGender()
                .getAge()
                .getBirthday()
                .getIsMarried()
                .getTelephone()
                .getAddress();

    }
}
