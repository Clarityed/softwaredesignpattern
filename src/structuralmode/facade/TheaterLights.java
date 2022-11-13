package structuralmode.facade;

/**
 * 电影院效果灯光（饿汉式实现）
 *
 * @author: clarity
 * @date: 2022年11月13日 10:19
 */
public class TheaterLights {

    private final static TheaterLights instance = new TheaterLights();

    /**
     * 私有化构造器
     */
    private TheaterLights() {

    }

    public static TheaterLights getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("电影院效果灯光打开");
    }

    public void off() {
        System.out.println("电影院效果灯光关闭");
    }

    public void dim() {
        System.out.println("电影院效果灯光调暗");
    }

    public void bright() {
        System.out.println("电影院效果灯光调亮");
    }

}
