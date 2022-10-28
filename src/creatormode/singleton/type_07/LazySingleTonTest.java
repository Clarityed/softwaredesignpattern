package creatormode.singleton.type_07;

/**
 * 懒汉式（静态内部类，线程安全的）
 *
 * @author: clarity
 * @date: 2022年10月28日 20:47
 */
public class LazySingleTonTest {

    public static void main(String[] args) {
        System.out.println("静态内部类实现的单例模式");
        LazySingleTon instance1 = LazySingleTon.getInstance();
        LazySingleTon instance2 = LazySingleTon.getInstance();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        System.out.println(instance1 == instance2);
    }

}

class LazySingleTon {
    // 1. 构造器私有化
    private LazySingleTon() {

    }

    // 2. 静态内部类，实现懒加载，因为在类的加载时不会加载静态内部
    //    并且静态内部类被调用进行类的加载时，是线程安全的，这是 JVM 虚拟机底层已经是实现的
    private static class LazySingleInstance {
        private static final LazySingleTon LAZY_SINGLE_TON = new LazySingleTon();
    }

    // 3. 提供一个静态公共方法
    public static LazySingleTon getInstance() {
        return LazySingleInstance.LAZY_SINGLE_TON;
    }
}