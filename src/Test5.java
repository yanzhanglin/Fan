import people.*;

public class Test5 {
    public static void main(String[] args){
        Income[] incomes = new Income[] {
            new Income(3000),
            new Salary(5080),
            new SpecialIncome(4000)

        };
        double total = 0;
        for (Income income:incomes){
            total = total + income.getTax();
        }

        System.out.printf("tax:%.2f",total);

        
}
}
