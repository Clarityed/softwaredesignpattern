package creatormode.buildhouse.builder;

/**
 * 房子（产品）
 *
 * @author: clarity
 * @date: 2022年11月19日 17:23
 */
public class House {

    /**
     * 地基
     */
    private String foundation;

    /**
     * 墙壁
     */
    private String walls;

    /**
     * 房顶
     */
    private String roof;

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public String getWalls() {
        return walls;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }
}
