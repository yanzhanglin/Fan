package money;
//稿费类
public class Raylty extends Income implements Gettax{
    public Raylty(double income){
        super(income);
    }

    @Override
    public double getTax(){
        double taxMent = income*0.8-800;
        if (taxMent < 0){
            return 0.0;
        }
        return taxMent*0.14;


    }

}