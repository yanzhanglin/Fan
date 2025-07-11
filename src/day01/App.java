package day01;
public class App {
    public static void main(String[] args){
        Demo1 xiaoming = new Demo1();
        xiaoming.setName("xiaoming");
        xiaoming.setAge(18);
        xiaoming.setHobby("basketball","football","table tennes");
        System.out.printf("%s的年龄是%d,爱好是%s,%S,%s",xiaoming.getName(),xiaoming.getAge(),xiaoming.getHobby()[0],xiaoming.getHobby()[1],xiaoming.getHobby()[2]);
    }
}
