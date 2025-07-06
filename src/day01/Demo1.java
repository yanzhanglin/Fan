package day01;

public class Demo1 {
    private String name;
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    private int age;
    public void setAge(int age){
        this.age = age;
    }
     public int getAge(){
        return this.age;
     }

     private String[] hobbys;
     public void setHobby(String... hobbys){
        this.hobbys = hobbys;
     }
     public String[] getHobby(){
        return this.hobbys;
     }


     private String[] languages;
     public void setLanguages(String[] languages){
        this.languages = languages;
     }
     
     public String[] getLanguages(){
        return this.languages;
     }
    
}
