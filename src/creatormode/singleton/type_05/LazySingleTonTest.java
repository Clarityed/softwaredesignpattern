package creatormode.singleton.type_05;

/**
 * 懒汉式（线程安全，同步代码块）但是其实并不是线程安全的
 *
 * @author: clarity
 * @date: 2022年10月28日 20:10
 */
public class LazySingleTonTest {

    public static void main(String[] args) {
        System.out.println("线程不安全的单例模式");
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

    private static LazySingleTon lazySingleTon;


    public static LazySingleTon getInstance() {
        if (lazySingleTon == null) {
            synchronized (LazySingleTon.class) {
                lazySingleTon = new LazySingleTon();
            }
        }
        return lazySingleTon;
    }
}