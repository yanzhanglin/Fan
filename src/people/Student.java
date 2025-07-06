package people;
import people.*;

public class Student extends Person{
    protected int score;
    public Student(String name,int age,int score){
        super(name, age);
        this.score = score;
    }

    public void setScore(int score){
        this.score = score;
    }

    public int getScore(){
        return this.score;
    }

    
}
