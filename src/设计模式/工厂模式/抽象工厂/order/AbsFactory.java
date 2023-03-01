package 设计模式.工厂模式.抽象工厂.order;

import 设计模式.工厂模式.抽象工厂.pizza.Pizza;


// 一个抽象工厂模式的抽象层（接口）
public interface AbsFactory {

    //让下面的工厂子类来具体实现
    public Pizza createPizza(String orderType);
}
