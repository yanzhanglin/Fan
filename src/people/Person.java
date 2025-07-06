
package people;

public class Person {
    protected String name;
    protected int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
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

    public String  doSport(){
        return new String("i am doing sport");
    }

}
