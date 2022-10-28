package creatormode.singleton.type_03;

/**
 * 单例模式（懒加载，线程不安全）
 *
 * @author: clarity
 * @date: 2022年10月26日 20:53
 */
public class LazySingleTonTest {

    public static void main(String[] args) {
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
    public static LazySingleTon getInstance() {
        if (lazySingleTon == null) {
            lazySingleTon = new LazySingleTon();
        }
        return lazySingleTon;
    }

}