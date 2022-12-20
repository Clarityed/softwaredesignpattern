package structuralmode.adapter2022.objectadapter;

/**
 * 客户端类
 *
 * @author: clarity
 * @date: 2022年12月19日 18:22
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("---------对象适配器---------");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
