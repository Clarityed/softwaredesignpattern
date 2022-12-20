package structuralmode.adapter2022.objectadapter;

/**
 * 手机类
 *
 * @author: clarity
 * @date: 2022年12月19日 18:20
 */
public class Phone {

    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压为5V，可以充电");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压大于5V，不可以充电");
        }

    }
}
