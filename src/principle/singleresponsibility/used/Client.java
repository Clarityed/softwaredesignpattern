package principle.singleresponsibility.used;

/**
 * 使用单一职责原则
 * 方案 2 的分析
 * 1. 遵守单一职责原则
 * 2. 但是这样做的改动很大，即将类分解，同时修改客户端
 * 3. 改进：直接修改 Phone 类，改动的代码会比较少 -> 方案 3
 *
 * @author: clarity
 * @date: 2022年11月20日 15:34
 */
public class Client {

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.use("小米手机");
        FamilyPhone familyPhone = new FamilyPhone();
        familyPhone.use("移动家用电话");
        PublicPhone publicPhone = new PublicPhone();
        publicPhone.use("福州马尾区公共电话");
    }

}

class MobilePhone {
    public void use(String phone) {
        System.out.println(phone + "随时随地的使用");
    }
}

class FamilyPhone {
    public void use(String phone) {
        System.out.println(phone + "在家里使用");
    }
}

class PublicPhone {
    public void use(String phone) {
        System.out.println(phone + "在指定公共场所的相应位置使用");
    }
}
