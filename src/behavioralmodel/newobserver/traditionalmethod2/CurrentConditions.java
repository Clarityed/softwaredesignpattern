package behavioralmodel.newobserver.traditionalmethod2;

/**
 * 气象局自己的网站
 *
 * @author: clarity
 * @date: 2022年11月12日 13:56
 */
public class CurrentConditions {

    /**
     * 温度
     */
    private float temperature;

    /**
     * 气压
     */
    private float pressure;

    /**
     * 湿度
     */
    private float humidity;

    public void display() {
        System.out.println("今天的温度是：" + temperature);
        System.out.println("今天的气压是：" + pressure);
        System.out.println("今天的湿度是：" + humidity);
    }

    /**
     * 推送方法，主要作用是让气象局调用，实时更新该网站的天气数据
     * @param temperature
     * @param pressure
     * @param humidity
     */
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.display();
    }

}
