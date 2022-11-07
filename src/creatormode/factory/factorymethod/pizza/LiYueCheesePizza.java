package creatormode.factory.factorymethod.pizza;

/**
 * 璃月奶酪 Pizza 类
 *
 * @author: clarity
 * @date: 2022年11月07日 10:13
 */
public class LiYueCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("璃月奶酪披萨");
        System.out.println("给璃月奶酪披萨准备原材料");
    }
}
