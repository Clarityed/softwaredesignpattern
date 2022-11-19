package creatormode.buildhouse.builder;

/**
 * 抽象建造者
 *
 * @author: clarity
 * @date: 2022年11月19日 17:30
 */
public abstract class HouseBuilder {

    // 组合房子（产品）
    protected final House house = new House();

    // 建造房子的方法
    /**
     * 打地基
     */
    public abstract void buildBasic();

    /**
     * 砌墙
     */
    public abstract void buildWalls();

    /**
     * 封顶
     * */
    public abstract void roofed();

    // 获得建造好的房子
    public House buildHouse() {
        return house;
    }

}
