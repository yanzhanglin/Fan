package neibulei;

public class Main{
    public static void main(String[] args){
        Computer lenovo = new Computer("lenovo", 54, "intel", "sangsan");
        System.out.printf("%s\n",lenovo.displayDeviceInfo());
        lenovo.use(5);
        Computer.DeviceBattery kunlunBattery= lenovo.new DeviceBattery(54);
        System.out.printf("%s的电量%s\n",lenovo.getBrand(),lenovo.battery.isLow());
        System.out.printf("%s的电量%s\n",lenovo.getBrand(),kunlunBattery.isLow());



    }
}