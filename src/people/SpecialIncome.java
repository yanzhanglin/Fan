package people;

public class SpecialIncome extends Income{
    public SpecialIncome(double income){
        super(income);
    }

    @Override
    public double getTax(){
        return 0.0;
    }
}
