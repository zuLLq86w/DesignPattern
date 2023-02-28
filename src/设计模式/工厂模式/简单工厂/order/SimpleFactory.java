package 设计模式.工厂模式.简单工厂.order;

import 设计模式.工厂模式.简单工厂.pizza.CheesePizza;
import 设计模式.工厂模式.简单工厂.pizza.GreekPizza;
import 设计模式.工厂模式.简单工厂.pizza.Pizza;

//简单工厂类
public class SimpleFactory {

    //根据orderType返回对应的Pizza对象
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("greek");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("cheese");
        }
        return pizza;
    }
}
