package creatormode.factory.traditionalway.order;

import creatormode.factory.traditionalway.pizza.CheesePizza;
import creatormode.factory.traditionalway.pizza.GreekPizza;
import creatormode.factory.traditionalway.pizza.PepperPizza;
import creatormode.factory.traditionalway.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 制作 pizza
 *
 * @author: clarity
 * @date: 2022年10月29日 20:53
 */
public class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            if ("cheese".equals(orderType)) {
                pizza = new CheesePizza();
                pizza.setName("cheese");
            } else if ("greek".equals(orderType)) {
                pizza = new GreekPizza();
                pizza.setName("greek");
            } else if ("pepper".equals(orderType)) {
                pizza = new PepperPizza();
                pizza.setName("pepper");
            } else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza Type：");
            String str = bufferedReader.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
