package principle.liskovsubstitution.use;

/**
 * 使用里氏替换原则
 * 1. 子类中尽量不要重写父类的方法
 * 2. 在适当的情况下，可以通过聚合，组合，依赖来解决问题。
 *
 * @author: clarity
 * @date: 2022年11月28日 16:36
 */
public class Client {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("1 - 1 = " + a.func1(1, 1));
        System.out.println("1 - 2 = " + a.func1(1, 2));
        B b = new B();
        System.out.println("1 - 1 = " + b.func3(1, 1));
        System.out.println("1 - 2 = " + b.func3(1, 2));
        System.out.println("1 + 1 + 9 = " + b.func2(1, 1));
    }
}

class Base {

}

class A extends Base {

    public int func1(int a, int b) {
        return a - b;
    }
}

class B extends Base {

    private A a = new A();

    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }
}
