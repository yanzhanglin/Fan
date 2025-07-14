package day01;
public class Test1 {
    public static void main(String[] args){
        Demo1 hong = new Demo1();
        String name = "hong";
        int age = 20;
        hong.setName(name);
        hong.setAge(age);
        System.out.printf("%s,%d",hong.getName(),hong.getAge());
        age = 18;
        name = "xiaoli";
        System.out.printf("%s,%d",name,age);
        System.out.printf("%s,%d",hong.getName(),hong.getAge());

    }
    

}
