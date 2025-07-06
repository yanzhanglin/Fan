package money;


public class Test1 {
    public static void main(String[] args){
        Salary salary = new Salary(6000);
        Raylty raylty = new Raylty(9480);
        System.out.printf("税款为:%.2f",salary.getTax()+raylty.getTax());

    }


}
