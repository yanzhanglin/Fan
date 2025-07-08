package neibulei;

public interface ElectronicDevice {
    String getBrand();
    Battery getBattery();
    int getBatteryLevel();
    void use(int powerConsume);

    interface Battery{
        int getBatteryLevel();
        void charge(int amount);
        void consume(int amount);
        boolean isLow();
    }

    default String displayDeviceInfo(){
        return String.format("品牌：%s\t剩余电量：%d%%\t电池电量%s",
        getBrand(),
        getBatteryLevel(),getBattery().isLow()?"低":"正常");
    }
}
