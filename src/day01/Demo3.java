package day01;
//关于构造方法、方法付重载，配合test3.java使用

public class Demo3 {
    protected String name;
    protected int age;
    protected String sexual;
    public String bankCard;

    public Demo3(String name,int age){
        this.name = name;
        this.age = age;
    }

    public Demo3(String bankCard){
        this.bankCard = bankCard;

    }

    public Demo3(String name,int age,String sexual){
        this(name,age);
        this.sexual = sexual;

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setSexual(String sexual){
        this.sexual = sexual;
    }

    public String getSexual(){
        return this.sexual;
    }

    public String getInfo(String name){
        return this.name;
    }
    
    public int getInfo(int age){
        return this.age;
    }
}
