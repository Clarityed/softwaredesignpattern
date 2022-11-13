
package structuralmode.facade;

/**
 * 环绕音响（饿汉式实现）
 *
 * @author: clarity
 * @date: 2022年11月13日 10:19
 */
public class Stereo {

    private final static Stereo instance = new Stereo();

    /**
     * 私有化构造器
     */
    private Stereo() {

    }

    public static Stereo getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("环绕音响打开");
    }

    public void off() {
        System.out.println("环绕音响关闭");
    }

    public void setVolume() {
        System.out.println("环绕音响设置音量");
    }

    // 。。。。。。

}
