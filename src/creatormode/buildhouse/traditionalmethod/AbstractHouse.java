package creatormode.buildhouse.traditionalmethod;

/**
 * 房子（抽象类）
 *
 * @author: clarity
 * @date: 2022年11月19日 16:13
 */
public abstract class AbstractHouse {

    // 打地基
    public abstract void buildBasic();
    // 砌墙
    public abstract void buildWalls();
    // 封顶
    public abstract void roofed();
    // 按顺序完成上面的操作
    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }

}
