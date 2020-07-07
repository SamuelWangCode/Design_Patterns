package tongji.ljn.InterfaceFluent;

public class InterfaceFluent {
    private String name;
    private int age;
    private String gender;
    private String  telephoneNum;
    private String address;
    private boolean isMarried;
    private String birthday;
    private String descStr = "InterfaceFluent("+hashCode()+"):";
    public InterfaceFluent setBirthday(String birthday){
        this.birthday = birthday;
        System.out.println(descStr+"setBirthday:");
        return this;
    }

    public InterfaceFluent getBirthday(){
        System.out.println(descStr+"getBirthday:");
        System.out.println("生日："+this.birthday);

        return this;
    }

    public InterfaceFluent setAddress(String address) {
        this.address = address;
        System.out.println(descStr+"setAddress:");
        return this;
    }

    public InterfaceFluent getAddress(){
        System.out.println(descStr+"getAddress:");
        System.out.println("地址："+this.address);
        return this;
    }

    public InterfaceFluent setAge(int age) {
        this.age = age;
        System.out.println(descStr+"setAge:");
        return this;
    }

    public InterfaceFluent getAge(){
        System.out.println(descStr+"getAge:");
        System.out.println("年龄："+this.age);
        return this;
    }

    public InterfaceFluent setGender(String gender){
        System.out.println(descStr+"setGender:");
        this.gender = gender;
        return this;
    }

    public InterfaceFluent getGender(){
        System.out.println(descStr+"getGender:");
        System.out.println("性别："+this.gender);
        return this;
    }

    public InterfaceFluent setIsMarried(boolean isMarried){
        System.out.println(descStr+"setIsMarried:");
        this.isMarried = isMarried;
        return this;
    }

    public InterfaceFluent getIsMarried(){
        System.out.println(descStr+"getIsMarried:");
        if (isMarried){
            System.out.println("婚恋情况：已婚");
        }
        else System.out.println("婚恋情况：未婚");
        return this;
    }

    public InterfaceFluent setName(String name){
        this.name = name;
        System.out.println(descStr+"setName:");
        return this;
    }

    public InterfaceFluent getName(){
        System.out.println(descStr+"getName:");
        System.out.println("姓名："+this.name);
        return this;
    }

    public InterfaceFluent setTelephone(String num){
        this.telephoneNum = num;
        System.out.println(descStr+"setTelephone:");
        return this;
    }

    public InterfaceFluent getTelephone(){
        System.out.println(descStr+"getTelephone:");
        System.out.println("电话："+this.telephoneNum);
        return this;
    }
}
