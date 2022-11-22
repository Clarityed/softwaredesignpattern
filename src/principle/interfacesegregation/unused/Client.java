package principle.interfacesegregation.unused;

/**
 * 未使用接口隔离原则
 *
 * @author: clarity
 * @date: 2022年11月22日 14:31
 */
public class Client {

    public static void main(String[] args) {
        Interface1 interface1B = new B();
        A a = new A();
        a.depend1(interface1B);
        a.depend2(interface1B);
        a.depend3(interface1B);
        System.out.println("--------------------");
        Interface1 interface1D = new D();
        C c = new C();
        c.depend1(interface1D);
        c.depend4(interface1D);
        c.depend5(interface1D);
    }

}

interface Interface1 {
    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

class B implements Interface1 {

    @Override
    public void operation1() {
        System.out.println("B 类实现 Interface1 接口 operation1 方法");
    }

    @Override
    public void operation2() {
        System.out.println("B 类实现 Interface1 接口 operation2 方法");
    }

    @Override
    public void operation3() {
        System.out.println("B 类实现 Interface1 接口 operation3 方法");
    }

    @Override
    public void operation4() {
        System.out.println("B 类实现 Interface1 接口 operation4 方法");
    }

    @Override
    public void operation5() {
        System.out.println("B 类实现 Interface1 接口 operation5 方法");
    }
}

class D implements Interface1 {

    @Override
    public void operation1() {
        System.out.println("D 类实现 Interface1 接口 operation1 方法");
    }

    @Override
    public void operation2() {
        System.out.println("D 类实现 Interface1 接口 operation2 方法");
    }

    @Override
    public void operation3() {
        System.out.println("D 类实现 Interface1 接口 operation3 方法");
    }

    @Override
    public void operation4() {
        System.out.println("D 类实现 Interface1 接口 operation4 方法");
    }

    @Override
    public void operation5() {
        System.out.println("D 类实现 Interface1 接口 operation5 方法");
    }
}

class A { // A 类通过接口 Interface1 依赖（使用）B 类，但是只会用到 1，2，3 方法
    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }

    public void depend2(Interface1 interface1) {
        interface1.operation2();
    }

    public void depend3(Interface1 interface1) {
        interface1.operation3();
    }
}

class C { // C 类通过接口 Interface1 依赖（使用）D 类，但是只会用到 1，4，5 方法
    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }

    public void depend4(Interface1 interface1) {
        interface1.operation4();
    }

    public void depend5(Interface1 interface1) {
        interface1.operation5();
    }
}