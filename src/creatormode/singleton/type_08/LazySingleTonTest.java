package creatormode.singleton.type_08;

/**
 * 懒汉式（枚举，线程安全的）
 *
 * @author: clarity
 * @date: 2022年10月28日 21:02
 */
public class LazySingleTonTest {
    public static void main(String[] args) {
        System.out.println("枚举实现的单例模式");
        LazySingleTon instance1 = LazySingleTon.LAZY_SINGLE_TON;
        LazySingleTon instance2 = LazySingleTon.LAZY_SINGLE_TON;
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        System.out.println(instance1 == instance2);
        instance1.sayHello();
    }
}

enum LazySingleTon {
    LAZY_SINGLE_TON;
    public void sayHello() {
        System.out.println("hello");
    }
}