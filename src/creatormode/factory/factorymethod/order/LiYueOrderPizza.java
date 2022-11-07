package creatormode.factory.factorymethod.order;

import creatormode.factory.factorymethod.pizza.LiYueCheesePizza;
import creatormode.factory.factorymethod.pizza.LiYueCurryPizza;
import creatormode.factory.factorymethod.pizza.Pizza;

/**
 * 璃月 Pizza 制作
 *
 * @author: clarity
 * @date: 2022年11月07日 10:28
 */
public class LiYueOrderPizza extends OrderPizza {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LiYueCheesePizza();
        } else if ("curry".equals(orderType)) {
            pizza = new LiYueCurryPizza();
        }
        return pizza;
    }
}
