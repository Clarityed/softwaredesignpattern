
package structuralmode.facade;

/**
 * DVD（饿汉式实现）
 *
 * @author: clarity
 * @date: 2022年11月13日 10:19
 */
public class DVDPlayer {

    private final static DVDPlayer instance = new DVDPlayer();

    /**
     * 私有化构造器
     */
    private DVDPlayer() {

    }

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("DVD打开");
    }

    public void off() {
        System.out.println("DVD关闭");
    }

    public void play() {
        System.out.println("DVD播放电影");
    }

    public void pause() {
        System.out.println("DVD暂停电影");
    }

    public void setDVD() {
        System.out.println("DVD设置影片");
    }

    // 。。。。。。

}
