package structuralmode.facade;

/**
 * 家庭电影院（外观模式）
 *
 * @author: clarity
 * @date: 2022年11月13日 10:42
 */
public class HomeTheaterFacade {

    // 聚合所有构成家庭电影院的子系统
    private PopCorn popCorn;

    private Screen screen;

    private Stereo stereo;

    private Projector projector;

    private DVDPlayer dvdPlayer;

    private TheaterLights theaterLights;

    // 构造器里直接传递聚合对象
    public HomeTheaterFacade() {
        this.popCorn = PopCorn.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
        this.theaterLights = TheaterLights.getInstance();
    }

    public void ready() {
        System.out.println("-----------准备阶段-----------");
        popCorn.on();
        screen.down();
        projector.on();
        projector.focus();
        stereo.on();
        dvdPlayer.on();
        dvdPlayer.setDVD();
        popCorn.pop();
        theaterLights.dim();
    }

    public void play() {
        System.out.println("-----------播放阶段-----------");
        dvdPlayer.play();
    }

    public void pause() {
        System.out.println("-----------暂停阶段-----------");
        dvdPlayer.pause();
        // 可进行其他操作
        projector.zoom();
    }

    public void end() {
        System.out.println("-----------结束阶段-----------");
        theaterLights.bright();
        popCorn.off();
        screen.up();
        projector.off();
        dvdPlayer.off();
        stereo.off();
    }

}
