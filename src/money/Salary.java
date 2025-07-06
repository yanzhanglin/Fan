package money;

public class Salary extends Income implements Gettax{
    public Salary(double income){
        super(income);
    }

    @Override
    public double getTax(){
        if (income < 5000){
            return 0;
        }
        return (income - 5000)*0.2;
    }

}
