package 设计原则.开闭原则.improve;

public class Main {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new Other());
    }
}

// 这是一个用于绘图的类 (使用方)
class GraphicEditor {
    public void drawShape(Shape shape) {
        shape.draw();
    }

    public void drawRectangle(Shape shape) {
        System.out.println("矩形");
    }

    public void drawCircle(Shape shape) {
        System.out.println("圆形");
    }

    public void drawTriangle(Shape shape) {
        System.out.println("三角形");
    }
}

// Shape类， 基类
abstract class Shape {
    int m_type;

    public abstract void draw(); // 抽象方法
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

// 新增画三角形
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}


// 新增一个图形
class Other extends Shape {
    Other(){
        super.m_type = 4;
    }

    @Override
    public void draw() {
        System.out.println("绘制其它图形");
    }
}
