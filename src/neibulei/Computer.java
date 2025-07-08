package neibulei;

public class Computer extends BaseElectronicProduction{
    private String cpu;
    private String memory;
    public Computer(String brand,int initialCharge,String cpu,String memory){
        super(brand,initialCharge);
        this.cpu = cpu;
        this.memory = memory;
    }

    public String getCPU(){
        return this.cpu;
    }
    public String getMemory(){
        return this.memory;
    }

    @Override
    public String displayDeviceInfo(){
        return String.format("品牌：%s\tcpu:%s,内存:%S\t剩余电量：%d%%\t电池电量%s",
        getBrand(),
        getCPU(),
        getMemory(),
        getBatteryLevel(),getBattery().isLow()?"低":"正常");
    }


}
