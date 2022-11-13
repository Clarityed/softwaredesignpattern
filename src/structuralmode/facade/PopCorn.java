package structuralmode.facade;

/**
 * 爆米花机器（饿汉式实现）
 *
 * @author: clarity
 * @date: 2022年11月13日 10:19
 */
public class PopCorn {

    private final static PopCorn instance = new PopCorn();

    /**
     * 私有化构造器
     */
    private PopCorn() {

    }

    public static PopCorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("爆米花机启动");
    }

    public void off() {
        System.out.println("爆米花机关闭");
    }

    public void pop() {
        System.out.println("爆米花机制作出爆米花，并且去拿爆米花");
    }

}
