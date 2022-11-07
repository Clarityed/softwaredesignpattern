package creatormode.factory.factorymethod.pizza;

/**
 * 须弥咖喱 Pizza 类
 *
 * @author: clarity
 * @date: 2022年11月07日 10:13
 */
public class XuMiCurryPizza extends Pizza {
    @Override
    public void prepare() {
        setName("须弥咖喱披萨");
        System.out.println("给须弥咖喱披萨准备原材料");
    }
}
