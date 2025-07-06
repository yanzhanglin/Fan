package money;

public interface Gettax {
    double getTax();
    default boolean isTaxFree(){
        return getTax() == 0;
        
    }

    
}
