package creatormode.factory.abstractfactory.pizza;

/**
 * 璃月咖喱 Pizza 类
 *
 * @author: clarity
 * @date: 2022年11月07日 10:13
 */
public class LiYueCurryPizza extends Pizza {
    @Override
    public void prepare() {
        setName("璃月咖喱披萨");
        System.out.println("给璃月咖喱披萨准备原材料");
    }
}
