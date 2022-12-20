package structuralmode.adapter2022.interfaceadapter;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2022年12月20日 18:19
 */
public class Client {

    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void operation1() {
                System.out.println("使用了 operation1 方法！");
            }
        };
        absAdapter.operation1();
    }
}
