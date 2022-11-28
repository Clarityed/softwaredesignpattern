package principle.dependenceinversion.used;

/**
 *
 * 方式 2
 * 使用依赖倒转（倒置）原则
 * 分析未使用的方式得出了解决思路：
 *  引入一个抽象的接口 IReceive，表示接收者，这样 Person 类与接口 IReceive 发生依赖
 *  这样也刚好是细节依赖抽象；并且因为 Email，QQ 等等属于接收的范围，它们各自实现了 IReceive 接口就可以了
 *  这样我们就符合依赖倒转原则
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

interface IReceive {

    String getInfo();
}

class Email implements IReceive {

    public String getInfo() {
        return "通过电子邮件获取的信息";
    }

}

class QQ implements IReceive {

    public String getInfo() {
        return "通过 QQ 获取的信息";
    }
}

class Person {

    /**
     *
     * @param iReceive 对接口进行依赖
     */
    public void receive(IReceive iReceive) {
        System.out.println(iReceive.getInfo());
    }
}