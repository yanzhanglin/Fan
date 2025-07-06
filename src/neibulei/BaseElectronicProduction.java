package neibulei;

public abstract class BaseElectronicProduction implements ElectronicDevice{
    protected String brand;
    protected BatteryManager battery;

    public BaseElectronicProduction(String brand,int initialCharge){
        this.brand = brand;
        this.battery = new BatteryManager(initialCharge);
    }


    protected class BatteryManager implements Battery{
        protected int batteryLevel;
        public BatteryManager(int initialCharge){
            this.batteryLevel = initialCharge;
        }

        @Override
        public int getBatteryLevel(){
            return this.batteryLevel;
        }

        @Override
        public void charge(int amount){
            batteryLevel += amount;
            System.out.printf("充电中，充电%d,剩余电量:%d",amount,this.batteryLevel);  
        }

        @Override
        public void consume(int amount){
            batteryLevel -= amount;
            System.out.printf("使用中，耗电%d,剩余电量:%d",amount,this.batteryLevel);

        }

        @Override
        public boolean isLow(){
            if (this.batteryLevel < 20){
                return true;
            }
            return false;
        }
    }
}
