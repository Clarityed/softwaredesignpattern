package behavioralmodel.newobserver.observer;

/**
 * 观察者接口，交给需要天气预报的网站或者第三方平台实现
 */
public interface Observer {

    void update(float temperature, float pressure, float humidity);

}
