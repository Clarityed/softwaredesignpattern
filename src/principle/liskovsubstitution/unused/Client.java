package principle.liskovsubstitution.unused;

/**
 * 未使用里氏替换原则

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
        // 这里出差的原因是程序员，本来是想调用 A 类的方法 func1 的
        // 由于疏忽或者对于重写的概念的误解，可能以为能够调用到父类的 func1
        System.out.println("1 - 1 = " + b.func1(1, 1));
        System.out.println("1 - 2 = " + b.func1(1, 2));
        System.out.println("1 + 1 + 9 = " + b.func2(1, 1));
    }
}

class A {

    public int func1(int a, int b) {
        return a - b;
    }
}

class B extends A {

    // 这里重写了 A 类的方法可能是无意识的
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
}
