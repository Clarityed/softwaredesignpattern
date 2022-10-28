package creatormode.singleton.type_06;

/**
 * 懒汉式（双重检查，英文名称 DoubleCheck）
 *
 * @author: clarity
 * @date: 2022年10月28日 20:28
 */
public class LazySingleTonTest {

    public static void main(String[] args) {
        System.out.println("线程安全的单例模式");
        LazySingleTon instance1 = LazySingleTon.getInstance();
        LazySingleTon instance2 = LazySingleTon.getInstance();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        System.out.println(instance1 == instance2);
    }
}

class LazySingleTon {

    private LazySingleTon() {

    }

    private static volatile LazySingleTon lazySingleTon;

    // 加入双重检查代码，解决线程安全问题，同时解决懒加载问题
    public static LazySingleTon getInstance() {
        if (lazySingleTon == null) {
            synchronized (LazySingleTon.class) {
                if (lazySingleTon == null) {
                    lazySingleTon = new LazySingleTon();
                }
            }
        }
        return lazySingleTon;
    }
}