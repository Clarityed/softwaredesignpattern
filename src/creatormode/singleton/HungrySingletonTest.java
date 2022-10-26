package creatormode.singleton;

/**
 * 单例模式（饿汉式）
 *
 * @author: clarity
 * @date: 2022年10月26日 17:24
 */
public class HungrySingletonTest {

    public static void main(String[] args) {
        HungrySingleton instance1 = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();
        System.out.println(instance1 == instance2);
    }

}


class HungrySingleton {

    // 首先要有一个私有构造，防止被 new 出一个新的对象
    private HungrySingleton() {

    }

    // 饿汉式在类加载的时候就会创建对象实例
    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    // 对外提供一个方法，调用使用这个唯一的对象
    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

}