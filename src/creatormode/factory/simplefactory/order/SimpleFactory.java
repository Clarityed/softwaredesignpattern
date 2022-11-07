package creatormode.factory.simplefactory.order;

import creatormode.factory.simplefactory.pizza.Pizza;
import creatormode.factory.simplefactory.pizza.CheesePizza;
import creatormode.factory.simplefactory.pizza.GreekPizza;
import creatormode.factory.simplefactory.pizza.PepperPizza;

/**
 * 简单工厂类
 *
 * @author: clarity
 * @date: 2022年10月30日 20:56
 */
public class SimpleFactory {

    public Pizza createPizza(String orderType) {

        System.out.println("使用简单工厂模式");
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("cheese");
        } else if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("greek");
        } else if ("pepper".equals(orderType)) {
            pizza = new PepperPizza();
            pizza.setName("pepper");
        }
        return pizza;

    }

    public static Pizza createPizzaStatic(String orderType) {

        System.out.println("使用简单工厂模式，静态方法调用");
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("cheese");
        } else if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("greek");
        } else if ("pepper".equals(orderType)) {
            pizza = new PepperPizza();
            pizza.setName("pepper");
        }
        return pizza;

    }

}
