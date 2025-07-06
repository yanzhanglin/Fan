package day02;

public class Test {
    public static void main(String[] args){
        Person xiaoming = new Person("xiaoming",18);
        System.out.printf("%d\n",Person.count);

        Person li = new Person("li", 15);
        System.out.printf("%d\n",li.count);
        System.out.printf("%d\n",xiaoming.count);

        Person.setCount(80);
        System.out.printf("%d",Person.count);
    }

}
