package 设计模式.工厂模式.简单工厂.pizza;


public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给制作奶酪披萨准备原材料");
    }
}
