package creatormode.buildhouse.builder;

/**
 * 普通房子
 *
 * @author: clarity
 * @date: 2022年11月19日 16:17
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        this.house.setFoundation("5米地基");
        System.out.println("给普通房子打5米地基");
    }

    @Override
    public void buildWalls() {
        this.house.setWalls("10厘米厚度");
        System.out.println("给普通房子砌10厘米厚度");
    }

    @Override
    public void roofed() {
        this.house.setRoof("普通封顶");
        System.out.println("给普通房子封顶");
    }
}
