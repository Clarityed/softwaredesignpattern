package creatormode.factory.factorymethod.pizza;

/**
 * Pizza 抽象类
 *
 * @author: clarity
 * @date: 2022年10月29日 20:43
 */
public abstract class Pizza {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepare();

    public void bake() {
        System.out.println(name + "进行烘烤");
    }

    public void cut() {
        System.out.println(name + "进行切分");
    }

    public void box() {
        System.out.println(name + "进行打包");
    }

}
