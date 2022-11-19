package creatormode.buildhouse.traditionalmethod;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2022年11月19日 16:20
 */
public class Client {

    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
        HighBuilding highBuilding = new HighBuilding();
        highBuilding.build();
    }

}
