package creatormode.factory.factorymethod.order;

import java.util.Scanner;

/**
 * 购买披萨（启动程序）
 *
 * @author: clarity
 * @date: 2022年11月07日 10:34
 */
public class PizzaStory {

    public static void main(String[] args) {
        System.out.println("请输入您要的 Pizza 地区名称：");
        Scanner scanner = new Scanner(System.in);
        String area = scanner.nextLine();
        if (area != null && area.equals("璃月")) {
            new LiYueOrderPizza();
        } else if (area != null && area.equals("须弥")) {
            new XuMiOrderPizza();
        } else {
            System.out.println("该地区的 Pizza 店不存在");
        }
    }

}
