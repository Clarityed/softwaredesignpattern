package principle.dependenceinversion.unused;

/**
 *
 * 方式 1
 * 未使用依赖倒转（倒置）原则，也就是传统方式
 *
 * @author: clarity
 * @date: 2022年11月25日 17:24
 */
public class Client {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new QQ());
    }
}

class Email {

    public String getInfo() {
        return "通过电子邮件获取的信息";
    }
}

class QQ {

    public String getInfo() {
        return "通过 QQ 获取的信息";
    }
}

// 完成 Person 接收消息的功能
// 传统方式实现
// 分析
// 1. 简单，比较容易想到
// 2. 如果我们获取的对象是微信，短信，QQ等等，则新增类，同时方法 Person 也要修改或者增加相应的接收方法
class Person {

    public void receive(Email email) {
        System.out.println(email.getInfo());
    }

    public void receive(QQ qq) {
        System.out.println(qq.getInfo());
    }
}