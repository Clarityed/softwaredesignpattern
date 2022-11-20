package principle.singleresponsibility.unused;

/**
 * 未使用单一职责原则
 *
 * @author: clarity
 * @date: 2022年11月20日 15:28
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.use("小米手机");
        phone.use("华为手机");
        phone.use("家用固定电话");
        phone.use("公共电话");
    }

}

/**
 * 电话工具
 * 方式 1
 * 1. 在方式 1 的 use 方法中，违反了单一职责原则
 * 2. 解决的方案非常简单，根据电话工具能够在哪些场所使用，分解成不同类即可
 */
class Phone {
    public void use(String phone) {
        System.out.println(phone + "随时随地的使用");
    }
}
