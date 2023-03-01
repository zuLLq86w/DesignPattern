package 设计模式.工厂模式.抽象工厂.order;

import 设计模式.工厂模式.抽象工厂.pizza.BJCheesePizza;
import 设计模式.工厂模式.抽象工厂.pizza.BJPepperPizza;
import 设计模式.工厂模式.抽象工厂.pizza.Pizza;

public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
