package 设计原则.开闭原则.Demo1;

public class Main {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
    }
}

// 这是一个用于绘图的类
class GraphicEditor {
    public void drawShape(Shape shape) {
        if (shape.m_type == 1) {
            drawRectangle(shape);
        } else if (shape.m_type == 2){
            drawCircle(shape);
        }

    }

    public void drawRectangle(Shape shape){
        System.out.println("矩形");
    }

    public void drawCircle(Shape shape){
        System.out.println("圆形");
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


