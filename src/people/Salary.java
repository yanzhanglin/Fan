package people;

public class Salary extends Income {
    public Salary(double income){
        super(income);
    }

    @Override
    public double getTax(){
        if (this.income < 5000){
            return 0;
        }
        return (this.income-5000)*0.25;
    }
}
