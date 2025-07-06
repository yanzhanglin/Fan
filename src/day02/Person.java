package day02;

public class Person {
    protected String name;
    protected int age;
    public static int count;
    //静态字段输入类本身，不属于实例，实例可以读取值，但是还是通过类的方式读取

    public Person(String name,int age){
        this.name = name;
        this.age = age;
        count++;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public static int getCount(){
        return count;
    }

    public static void setCount(int count){
        Person.count = count;

    }
}
