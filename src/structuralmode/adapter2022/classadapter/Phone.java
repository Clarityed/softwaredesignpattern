package structuralmode.adapter2022.classadapter;

/**
 * 手机类
 *
 * @author: clarity
 * @date: 2022年12月19日 18:20
 */
public class Phone {

    public void charging(IVoltage5V iVoltage5V) {
        System.out.println(iVoltage5V.output5V());
    }
}
