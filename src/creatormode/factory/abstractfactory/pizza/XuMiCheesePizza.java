package creatormode.factory.abstractfactory.pizza;

/**
 * 须弥奶酪 Pizza 类
 *
 * @author: clarity
 * @date: 2022年11月07日 10:13
 */
public class XuMiCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("须弥奶酪披萨");
        System.out.println("给须弥奶酪披萨准备原材料");
    }
}
