package creatormode.factory.abstractfactory.order;

import creatormode.factory.abstractfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 订购 Pizza
 *
 * @author: clarity
 * @date: 2022年11月07日 14:59
 */
public class OrderPizza {

    private AbstractFactory abstractFactory;

    private void setAbstractFactory(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public OrderPizza(AbstractFactory abstractFactory) {
        this.setAbstractFactory(abstractFactory);
        Pizza pizza = null;
        String orderType = "";
        do {
            orderType = getType();
            if (this.abstractFactory == null) {
                break;
            }
            pizza = this.abstractFactory.createPizza(orderType);
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
