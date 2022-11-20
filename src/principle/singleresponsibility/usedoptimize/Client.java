package principle.singleresponsibility.usedoptimize;

/**
 * 方案 3
 * 使用单一原则并进行优化，在方法级上的单一职责原则
 * 适用于方法比较少的情况下，如果一个类方法很多不建议采用该方法
 * 方案的分析：
 * 1. 这种修改没有对原本的类进行大量的修改，只是增加方法
 * 2. 这里虽然没有在类级别上遵守单一职责与原则，但是在方法级别上，仍然是遵守单一职责原则的
 *
 * @author: clarity
 * @date: 2022年11月20日 15:41
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.mobilePhoneUse("小米手机");
        phone.familyPhoneUse("移动家用电话");
        phone.publicPhoneUse("福州马尾区公共电话");
    }

}

class Phone {
    public void mobilePhoneUse(String phone) {
        System.out.println(phone + "随时随地的使用");
    }

    public void familyPhoneUse(String phone) {
        System.out.println(phone + "在家里使用");
    }

    public void publicPhoneUse(String phone) {
        System.out.println(phone + "在指定公共场所的相应位置使用");
    }
}