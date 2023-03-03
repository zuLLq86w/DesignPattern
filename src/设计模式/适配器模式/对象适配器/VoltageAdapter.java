package 设计模式.适配器模式.对象适配器;

// 适配器类
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V; // 关联关系 - 组合

    // 通过构造器传入一个Voltage220V实例
    public VoltageAdapter(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        // 获取到220v电压
        int dst = 0;
        if(null != voltage220V){
            int src = voltage220V.output220V(); // 获取220V 电压
            System.out.println("使用对象适配器，进行转换");
            dst = src / 44;
            System.out.println("适配完成，输出的电压= " + dst);

        }
        return dst;
    }
}
