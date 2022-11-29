package principle.openclosed.unused;

/**
 * 未使用开闭原则
 *
 * @author: clarity
 * @date: 2022年11月29日 10:43
 */
public class Client {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        // 然后我们要在这些代码的基础上增加新的图形
        // 增加菱形（diamond），在没有使用开闭原则的情况下
        graphicEditor.drawShape(new Diamond());
        // 这种我们会对修改原先使用方的代码，这是不可取的
        // 符合开闭原则的情况是可以增加实体类、函数、模块（提供方），而使用方不应该修改代码
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
        if (shape.getType() == 1) {
            drawRectangle();
        } else if (shape.getType() == 2) {
            drawCircle();
        } else if (shape.getType() == 3) {
            drawDiamond();
        }
    }

    /**
     * 画矩形图
     */
    public void drawRectangle() {
        System.out.println("画矩形图");
    }

    /**
     * 画圆形图
     */
    public void drawCircle() {
        System.out.println("画圆形图");
    }

    /**
     * 画菱形图
     */
    public void drawDiamond() {
        System.out.println("画菱形图");
    }
}

/**
 * 图形基类（提供方）
 */
class Shape {

    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}

class Rectangle extends Shape {

    public Rectangle() {
        super.setType(1);
    }
}

class Circle extends Shape {

    public Circle() {
        super.setType(2);
    }
}

class Diamond extends Shape {

    public Diamond() {
        super.setType(3);
    }
}
