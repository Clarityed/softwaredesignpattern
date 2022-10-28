package creatormode.singleton.type_04;

/**
 * 懒汉式（线程安全，同步方法）
 *
 * @author: clarity
 * @date: 2022年10月28日 17:25
 */
public class LazySingleTonTest {

    public static void main(String[] args) {
        System.out.println("线程安全的单例模式");
        LazySingleTon instance1 = LazySingleTon.getInstance();
        LazySingleTon instance2 = LazySingleTon.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}

class LazySingleTon {

    private static LazySingleTon lazySingleTon;

    private LazySingleTon() {

    }

    // 提供一个公共的静态方法调用，但是该方法不是线程安全的
    public static synchronized LazySingleTon getInstance() {
        if (lazySingleTon == null) {
            lazySingleTon = new LazySingleTon();
        }
        return lazySingleTon;
    }

}