/**
 * 电子产品接口
 */
public interface ElectronicProduct {
    // 获取品牌信息
    String getBrand();
    
    // 获取当前电池状态
    Battery getBattery();
    
    // 使用设备消耗电量
    void use(int powerConsumption);
    
    // 显示产品信息
    String displayInfo();
    
    // 电池接口（静态嵌套接口）
    interface Battery {
        int getLevel();
        void charge(int amount);
        void consume(int amount);
        boolean isLow();
    }
}

/**
 * 基础电子产品实现
 */
public abstract class BaseElectronicProduct implements ElectronicProduct {
    private final String brand;
    protected final BatteryImpl battery;  // 使用内部类实现
    
    public BaseElectronicProduct(String brand, int initialCharge) {
        this.brand = brand;
        this.battery = new BatteryImpl(initialCharge);
    }
    
    @Override
    public String getBrand() {
        return brand;
    }
    
    @Override
    public Battery getBattery() {
        return battery;
    }
    
    @Override
    public void use(int powerConsumption) {
        battery.consume(powerConsumption);
        System.out.printf("[%s] 使用中... 消耗 %d%% 电量%n", brand, powerConsumption);
    }
    
    @Override
    public String displayInfo() {
        return String.format("[%s] 电量: %d%%%s", 
            brand, 
            battery.getLevel(),
            battery.isLow() ? " (低电量警告!)" : "");
    }
    
    /**
     * 电池内部类 - 封装电量管理逻辑
     */
    protected class BatteryImpl implements Battery {
        private int level;
        
        public BatteryImpl(int initialLevel) {
            this.level = clamp(initialLevel);
        }
        
        @Override
        public int getLevel() {
            return level;
        }
        
        @Override
        public void charge(int amount) {
            if (amount <= 0) return;
            level = clamp(level + amount);
            System.out.printf("[%s] 充电中... +%d%% -> 当前电量: %d%%%n", 
                BaseElectronicProduct.this.brand, amount, level);
        }
        
        @Override
        public void consume(int amount) {
            if (amount <= 0) return;
            level = clamp(level - amount);
            
            if (isLow()) {
                System.out.printf("[%s] 警告: 低电量 (%d%%)!%n", 
                    BaseElectronicProduct.this.brand, level);
            }
        }
        
        @Override
        public boolean isLow() {
            return level < 20;  // 低于20%为低电量
        }
        
        // 保持电量在0-100范围内
        private int clamp(int value) {
            return Math.min(100, Math.max(0, value));
        }
    }
}

/**
 * 手机实现
 */
public class Smartphone extends BaseElectronicProduct {
    public Smartphone(String brand) {
        super(brand, 80);  // 初始电量80%
    }
    
    // 手机特有功能
    public void makeCall(int minutes) {
        int powerNeeded = minutes * 2;  // 每分钟消耗2%电量
        if (battery.getLevel() < powerNeeded) {
            System.out.println("电量不足，无法通话!");
            return;
        }
        
        battery.consume(powerNeeded);
        System.out.printf("通话中 (%d 分钟)... 剩余电量: %d%%%n", minutes, battery.getLevel());
    }
    
    // 快速充电功能
    public void quickCharge() {
        battery.charge(30);  // 快速充电30%
    }
}

/**
 * 笔记本电脑实现
 */
public class Laptop extends BaseElectronicProduct {
    private boolean isPowerSavingMode;
    
    public Laptop(String brand) {
        super(brand, 100);  // 初始满电量
    }
    
    // 笔记本电脑特有功能
    public void enablePowerSavingMode() {
        this.isPowerSavingMode = true;
        System.out.println("已启用省电模式");
    }
    
    @Override
    public void use(int powerConsumption) {
        int actualConsumption = isPowerSavingMode ? 
            powerConsumption / 2 :  // 省电模式下耗电减半
            powerConsumption;
        
        super.use(actualConsumption);
    }
}

// 使用示例
public class Main {
    public static void main(String[] args) {
        // 创建手机
        Smartphone phone = new Smartphone("小米");
        System.out.println(phone.displayInfo());
        
        // 使用手机功能
        phone.makeCall(10);
        phone.use(15);  // 其他使用
        System.out.println(phone.displayInfo());
        
        // 充电操作
        phone.getBattery().charge(25);
        phone.quickCharge();
        
        // 创建笔记本电脑
        Laptop laptop = new Laptop("联想");
        System.out.println(laptop.displayInfo());
        
        // 使用笔记本
        laptop.use(30);
        laptop.enablePowerSavingMode();
        laptop.use(30);  // 省电模式下实际只消耗15%
        
        // 测试低电量警告
        for (int i = 0; i < 5; i++) {
            laptop.use(10);
        }
        System.out.println(laptop.displayInfo());
    }
}