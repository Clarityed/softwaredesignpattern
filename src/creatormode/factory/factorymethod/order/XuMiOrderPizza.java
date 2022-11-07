package creatormode.factory.factorymethod.order;

import creatormode.factory.factorymethod.pizza.*;

/**
 * 须弥 Pizza 制作
 *
 * @author: clarity
 * @date: 2022年11月07日 10:28
 */
public class XuMiOrderPizza extends OrderPizza {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new XuMiCheesePizza();
        } else if ("curry".equals(orderType)) {
            pizza = new XuMiCurryPizza();
        }
        return pizza;
    }
}
