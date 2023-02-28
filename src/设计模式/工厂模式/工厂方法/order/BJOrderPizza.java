package 设计模式.工厂模式.工厂方法.order;

import 设计模式.工厂模式.工厂方法.pizza.BJCheesePizza;
import 设计模式.工厂模式.工厂方法.pizza.BJPepperPizza;
import 设计模式.工厂模式.工厂方法.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }

        return pizza;
    }
}
