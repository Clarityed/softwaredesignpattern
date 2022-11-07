package creatormode.factory.abstractfactory.order;

import creatormode.factory.abstractfactory.pizza.*;

/**
 * 须弥工厂（工厂子类）
 *
 * @author: clarity
 * @date: 2022年11月07日 14:53
 */
public class XuMiFactory implements AbstractFactory {
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
