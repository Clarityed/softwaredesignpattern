package creatormode.buildhouse.builder;

/**
 * 高楼
 *
 * @author: clarity
 * @date: 2022年11月19日 16:17
 */
public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        this.house.setFoundation("50米地基");
        System.out.println("给高楼打地基");
    }

    @Override
    public void buildWalls() {
        this.house.setWalls("50厘米厚度");
        System.out.println("给高楼砌50厘米厚度");
    }

    @Override
    public void roofed() {
        this.house.setRoof("高楼封顶");
        System.out.println("给高楼封顶");
    }
}
