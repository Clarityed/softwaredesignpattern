package creatormode.factory.abstractfactory.order;

import creatormode.factory.abstractfactory.pizza.LiYueCheesePizza;
import creatormode.factory.abstractfactory.pizza.LiYueCurryPizza;
import creatormode.factory.abstractfactory.pizza.Pizza;

/**
 * 璃月工厂（工厂子类）
 *
 * @author: clarity
 * @date: 2022年11月07日 14:51
 */
public class LiYueFactory implements AbstractFactory {
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
