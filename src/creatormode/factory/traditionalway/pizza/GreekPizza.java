package creatormode.factory.traditionalway.pizza;

/**
 * 希腊披萨
 *
 * @author: clarity
 * @date: 2022年10月29日 20:51
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备希腊披萨原材料");
    }
}
