package day01;
public class test3 {
    public static void main(String[] args){
        Demo3 student = new Demo3("yanlin",28,"man");
        System.out.printf("%s%d%s\n",student.getName(),student.getAge(),student.getSexual());
        System.out.printf("%s\t",student.getInfo(10));
        System.out.printf("%s",student.getInfo("age"));

    }

}
