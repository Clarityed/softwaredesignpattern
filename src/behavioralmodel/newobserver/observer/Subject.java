package behavioralmodel.newobserver.observer;

/**
 * 目标对象接口，交给气象局来实现
 */
public interface Subject {

    /**
     * 注册订阅该天气预报的观察者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除订阅该天气预报的观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知所有观察者更新数据
     */
    void notifyObserver();

}
