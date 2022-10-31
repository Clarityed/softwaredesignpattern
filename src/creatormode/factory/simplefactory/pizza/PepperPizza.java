package creatormode.factory.simplefactory.pizza;

/**
 * 胡椒披萨
 *
 * @author: clarity
 * @date: 2022年10月30日 20:16
 */
public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备胡椒披萨原材料");
    }
}
