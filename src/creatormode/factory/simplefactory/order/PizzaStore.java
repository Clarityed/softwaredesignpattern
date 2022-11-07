package creatormode.factory.simplefactory.order;

/**
 * 购买 pizza
 *
 * @author: scott
 * @date: 2022年10月29日 21:01
 */
public class PizzaStore {

    public static void main(String[] args) {
        // new OrderPizza(new SimpleFactory());
        // 调用静态简单工厂方法订购 Pizza
        new OrderPizzaByStatic();
    }

}
