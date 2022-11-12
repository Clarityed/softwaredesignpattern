package behavioralmodel.observer;

public class Client {
    public static void main(String[] args) {
        // 1、创建公众号对象
        ConcreteSubject concreteSubject = new ConcreteSubject();

        // 2、订阅公众号
        concreteSubject.attach(new WeiXinUser("clarity"));

        // 3、公众号更新，发生消息给订阅者
        concreteSubject.notify("刻晴壁纸更新了");
    }
}
