package 设计模式.工厂模式.抽象工厂.order;

import 设计模式.工厂模式.抽象工厂.pizza.LDCheesePizza;
import 设计模式.工厂模式.抽象工厂.pizza.LDPepperPizza;
import 设计模式.工厂模式.抽象工厂.pizza.Pizza;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
