package neibulei;

public interface ElectronicDevice {
    String getBrand();
    Battery getBattery();
    int getBatteryLevel();
    void use(int powerConsume);
    String displayInfo();
    interface Battery{
        int getBatteryLevel();
        void charge(int amount);
        void consume(int amount);
        boolean isLow();
    }
}
