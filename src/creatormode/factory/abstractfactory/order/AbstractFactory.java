package creatormode.factory.abstractfactory.order;

import creatormode.factory.abstractfactory.pizza.Pizza;

/**
 * 抽象工厂接口（一个抽象工厂模式的抽象层）
 *
 * @author: clarity
 * @date: 2022年11月07日 14:49
 */
public interface AbstractFactory {

    Pizza createPizza(String orderType);

}
