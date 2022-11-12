package behavioralmodel.newobserver.observer;

/**
 * 气象局网站（观察者）
 *
 * @author: clarity
 * @date: 2022年11月12日 19:42
 */
public class CurrentConditions implements Observer {

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
        System.out.println("气象局网站显示今天的温度是：" + temperature);
        System.out.println("气象局网站显示今天的气压是：" + pressure);
        System.out.println("气象局网站显示今天的湿度是：" + humidity);
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
