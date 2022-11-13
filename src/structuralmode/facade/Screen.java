package structuralmode.facade;

/**
 * 屏幕（饿汉式实现）
 *
 * @author: clarity
 * @date: 2022年11月13日 10:19
 */
public class Screen {

    private final static Screen instance = new Screen();

    /**
     * 私有化构造器
     */
    private Screen() {

    }

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println("屏幕上升");
    }

    public void down() {
        System.out.println("屏幕下降");
    }

}
