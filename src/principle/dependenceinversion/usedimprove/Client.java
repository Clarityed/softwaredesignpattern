package principle.dependenceinversion.usedimprove;

/**
 * 依赖倒转增强版
 *
 * @author: clarity
 * @date: 2022年11月28日 15:21
 */
public class Client {

    public static void main(String[] args) {
        // 方式 1 测试
        System.out.println("方式 1 测试");
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(new SAMSUNG());
        // 方式 2 测试
        System.out.println("方式 2 测试");
        OpenAndClose2 openAndClose2 = new OpenAndClose2(new SAMSUNG2());
        openAndClose2.open();
        // 方式 3 测试
        System.out.println("方式 3 测试");
        OpenAndClose3 openAndClose3 = new OpenAndClose3();
        openAndClose3.setTv(new SAMSUNG3());
        openAndClose3.open();
    }
}

// 方式 1：通过接口传递实现依赖
// 开关的接口
interface IOpenAndClose {

    /**
     * 抽象方法，接收接口
     * @param itv 接口对象
     */
    void open(ITV itv);
}

interface ITV {

    void play();
}

class SAMSUNG implements ITV {

    @Override
    public void play() {
        System.out.println("打开三星电视机");
        System.out.println("观看一段时间");
        System.out.println("关闭三星电视机");
    }
}

// 实现接口
class OpenAndClose implements IOpenAndClose {

    @Override
    public void open(ITV itv) {
        itv.play();
    }
}

// 方式 2：通过构造方法依赖传递
interface IOpenAndClose2 {

    void open();
}

interface ITV2 {

    void play();
}

class SAMSUNG2 implements ITV2 {

    @Override
    public void play() {
        System.out.println("打开三星电视机");
        System.out.println("观看一段时间");
        System.out.println("关闭三星电视机");
    }
}

// 实现接口
class OpenAndClose2 implements IOpenAndClose2 {

    private ITV2 itv2; // 成员变量

    public OpenAndClose2(ITV2 itv2) { // 构造器
        this.itv2 = itv2;
    }

    @Override
    public void open() {
        itv2.play();
    }
}

// 方式 3：通过 setter 方式实现
interface IOpenAndClose3 {

    void open();

    void setTv(ITV3 itv3);
}

interface ITV3 {

    void play();
}

class SAMSUNG3 implements ITV3 {

    @Override
    public void play() {
        System.out.println("打开三星电视机");
        System.out.println("观看一段时间");
        System.out.println("关闭三星电视机");
    }
}

// 实现接口
class OpenAndClose3 implements IOpenAndClose3 {

    private ITV3 itv3; // 成员变量

    @Override
    public void setTv(ITV3 itv3) {
        this.itv3 = itv3;
    }

    @Override
    public void open() {
        this.itv3.play();
    }
}