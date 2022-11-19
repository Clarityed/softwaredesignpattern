package creatormode.buildhouse.builder;

/**
 * 客户端
 *
 * @author: clarity
 * @date: 2022年11月19日 17:44
 */
public class Client {

    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.construct();
        System.out.println(house.getFoundation());
        System.out.println(house.getWalls());
        System.out.println(house.getRoof());
    }

}
