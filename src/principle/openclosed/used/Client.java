package principle.openclosed.used;

/**
 *
 * 使用开闭原则
 * 符合开闭原则的情况是可以增加实体类、函数、模块（提供方），而使用方不应该修改代码
 *
 * @author: clarity
 * @date: 2022年11月29日 11:20
 */
public class Client {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Diamond());
        // 使用绘制新图的功能
        graphicEditor.drawShape(new Oval());
    }
}

/**
 * 实现画图功能（使用方）
 */
class GraphicEditor {

    /**
     * 通过参数判断画出什么图
     */
    public void drawShape(Shape shape) {
        shape.draw();
    }
}

/**
 * 图形基类（提供方）
 */
abstract class Shape {

    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    /**
     * 抽象方法，交给子类完成绘制功能，不用在使用方实现绘图功能
     */
    public abstract void draw();
}

class Rectangle extends Shape {

    public Rectangle() {
        super.setType(1);
    }

    @Override
    public void draw() {
        System.out.println("画矩形图");
    }
}

class Circle extends Shape {

    public Circle() {
        super.setType(2);
    }

    @Override
    public void draw() {
        System.out.println("画圆形图");
    }
}

class Diamond extends Shape {

    public Diamond() {
        super.setType(3);
    }

    @Override
    public void draw() {
        System.out.println("画菱形图");
    }
}

/**
 * 新增椭圆形
 */
class Oval extends Shape {

    public Oval() {
        super.setType(4);
    }

    @Override
    public void draw() {
        System.out.println("画椭圆形图");
    }
}