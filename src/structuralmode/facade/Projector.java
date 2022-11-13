package structuralmode.facade;

/**
 * 投影仪（饿汉式实现）
 *
 * @author: clarity
 * @date: 2022年11月13日 10:19
 */
public class Projector {

    private final static Projector instance = new Projector();

    /**
     * 私有化构造器
     */
    private Projector() {

    }

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("投影仪打开");
    }

    public void off() {
        System.out.println("投影仪关闭");
    }

    public void focus() {
        System.out.println("投影仪聚焦");
    }

    public void zoom() {
        System.out.println("投影仪变焦");
    }

    // 。。。。。。

}
