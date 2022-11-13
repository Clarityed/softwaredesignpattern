package structuralmode.facade;

/**
 * 客户端
 *
 * @author: clarity
 * @date: 2022年11月13日 10:55
 */
public class Client {

    public static void main(String[] args) {

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();

        // 准备阶段
        homeTheaterFacade.ready();

        // 播放
        homeTheaterFacade.play();

        // 暂停，并进行其他操作
        homeTheaterFacade.pause();

        // 结束观看，关闭所有设备
        homeTheaterFacade.end();

    }

}
