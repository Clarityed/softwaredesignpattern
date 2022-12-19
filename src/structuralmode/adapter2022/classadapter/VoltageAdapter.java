package structuralmode.adapter2022.classadapter;

/**
 * 电压转换适配器
 *
 * @author: clarity
 * @date: 2022年12月19日 18:17
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        int srcVoltage = output220V();
        return srcVoltage / 44;
    }
}
