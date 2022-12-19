package structuralmode.adapter2022.classadapter;

/**
 * 220V 电压类
 *
 * @author: clarity
 * @date: 2022年12月19日 18:13
 */
public class Voltage220V {

    /**
     * 家庭插座输出 220V 电压
     * @return 家用电压
     */
    public int output220V() {
        int src = 220;
        System.out.println("家用电压：" + src);
        return src;
    }
}
