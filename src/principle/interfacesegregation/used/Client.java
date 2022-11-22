package principle.interfacesegregation.used;

/**
 * 使用接口隔开原则
 *
 * @author: clarity
 * @date: 2022年11月22日 14:53
 */
public class Client {

    public static void main(String[] args) {
        A a = new A();
        Interface1 interface1B = new B();
        Interface2 interface2B = new B();
        a.depend1(interface1B);
        a.depend2(interface2B);
        a.depend3(interface2B);
        System.out.println("------------------");
        C c = new C();
        Interface1 interface1D = new D();
        Interface3 interface3D = new D();
        c.depend1(interface1D);
        c.depend4(interface3D);
        c.depend5(interface3D);
    }
}

interface Interface1 {

    void operation1();
}

interface Interface2 {

    void operation2();

    void operation3();
}

interface Interface3 {

    void operation4();

    void operation5();
}

class B implements Interface1, Interface2 {

    @Override
    public void operation1() {
        System.out.println("B 类实现 Interface1 接口 operation1 方法");
    }

    @Override
    public void operation2() {
        System.out.println("B 类实现 Interface2 接口 operation2 方法");
    }

    @Override
    public void operation3() {
        System.out.println("B 类实现 Interface2 接口 operation3 方法");
    }
}

class D implements Interface1, Interface3 {

    @Override
    public void operation1() {
        System.out.println("D 类实现 Interface1 接口 operation1 方法");
    }

    @Override
    public void operation4() {
        System.out.println("D 类实现 Interface3 接口 operation4 方法");
    }

    @Override
    public void operation5() {
        System.out.println("D 类实现 Interface3 接口 operation5 方法");
    }
}

class A { // A 类通过接口 Interface1，Interface2 依赖（使用）B 类，但是只会用到 1，2，3 方法

    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }

    public void depend2(Interface2 interface2) {
        interface2.operation2();
    }

    public void depend3(Interface2 interface2) {
        interface2.operation3();
    }
}

class C { // C 类通过接口 Interface1，Interface3 依赖（使用）D 类，但是只会用到 1，4，5 方法

    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }

    public void depend4(Interface3 interface3) {
        interface3.operation4();
    }

    public void depend5(Interface3 interface3) {
        interface3.operation5();
    }
}