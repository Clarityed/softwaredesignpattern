package behavioralmodel.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    // 定义一个集合用来存储多个观察者对象
    private List<Observer> weiXinUserList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        weiXinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weiXinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        // 遍历所有观察者
        for (Observer observer : weiXinUserList) {
            // 调用观察者中的update方法
            observer.update(message);
        }
    }
}
