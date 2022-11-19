package creatormode.buildhouse.traditionalmethod;

/**
 * 普通房子
 *
 * @author: clarity
 * @date: 2022年11月19日 16:17
 */
public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("给普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("给普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("给普通房子封顶");
    }
}
