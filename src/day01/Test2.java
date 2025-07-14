package day01;
public class Test2 {
    public static void main(String[] args){
        Demo1 yan = new Demo1();
        String[] languages = {"java","python","golang"};
        yan.setLanguages(languages);
        System.out.printf("%s%s%s\n",yan.getLanguages()[0],yan.getLanguages()[1],yan.getLanguages()[2]);
        languages[0] = "javascript";
        System.out.printf("%s%s%s\n",languages[0],languages[1],languages[2]);
        System.out.printf("%s%s%s\n",yan.getLanguages()[0],yan.getLanguages()[1],yan.getLanguages()[2]);
        




    }

}
