package structuralmode.adapter2022.objectadapter;

/**
 * 电压转换适配器
 *
 * @author: clarity
 * @date: 2022年12月19日 18:17
 */
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        // 目标电压
        int dst = 0;
        if (voltage220V != null) {
            int srcVoltage = voltage220V.output220V();
            System.out.println("使用对象适配器，进行适配");
            dst = srcVoltage / 44;
            System.out.println("适配完成输出电压：" + dst);
        }
        return dst;
    }
}
