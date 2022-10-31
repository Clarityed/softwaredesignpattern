package creatormode.factory.simplefactory.pizza;

/**
 * 奶酪披萨类
 *
 * @author: clarity
 * @date: 2022年10月29日 20:48
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备奶酪披萨原材料");
    }
}
