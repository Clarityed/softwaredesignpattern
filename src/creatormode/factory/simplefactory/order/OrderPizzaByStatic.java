package creatormode.factory.simplefactory.order;

import creatormode.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 订购 Pizza 通过静态方法
 *
 * @author: clarity
 * @date: 2022年11月06日 16:59
 */
public class OrderPizzaByStatic {

    public OrderPizzaByStatic() {
        setSimpleFactory();
    }

    public void setSimpleFactory() {
        String orderType = "";
        do {
            orderType = getType();
            Pizza pizza = SimpleFactory.createPizzaStatic(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("披萨订购失败");
                break;
            }
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
