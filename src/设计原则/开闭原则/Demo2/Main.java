package 设计原则.开闭原则.Demo2;

public class Main {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}

// 这是一个用于绘图的类 (使用方)
class GraphicEditor {
    public void drawShape(Shape shape) {
        if (shape.m_type == 1) {
            drawRectangle(shape);
        } else if (shape.m_type == 2) {
            drawCircle(shape);
        } else if (shape.m_type == 3){
            drawTriangle(shape);
        }

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
class Shape {
    int m_type;
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}

// 新增画三角形
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }
}

