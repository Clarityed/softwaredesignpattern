package creatormode.factory.abstractfactory.order;

import java.util.Scanner;

/**
 * 购买披萨（启动程序）
 *
 * @author: clarity
 * @date: 2022年11月07日 10:34
 */
public class PizzaStory {

    public static void main(String[] args) {
        System.out.println("请输入您要的披萨地区名称：");
        Scanner scanner = new Scanner(System.in);
        String area = scanner.nextLine();
        if (area != null && area.equals("璃月")) {
            new OrderPizza(new LiYueFactory());
        } else if (area != null && area.equals("须弥")) {
            new OrderPizza(new XuMiFactory());
        } else {
            System.out.println("该地区的披萨店不存在");
        }
    }

}
