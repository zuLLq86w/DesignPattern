package 设计模式.工厂模式.简单工厂.order;

import 设计模式.工厂模式.简单工厂.pizza.CheesePizza;
import 设计模式.工厂模式.简单工厂.pizza.GreekPizza;
import 设计模式.工厂模式.简单工厂.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// 传统方式
//public class OrderPizza {
//
//    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType;// 订购披萨的类型
//        do {
//            orderType = getType();
//            if (orderType.equals("greek")) {
//                pizza = new GreekPizza();
//                pizza.setName("greek");
//            } else if (orderType.equals("cheese")) {
//                pizza = new CheesePizza();
//                pizza.setName("cheese");
//            } else {
//                break;
//            }
//
//            // 输出pizza制作的过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//    }
//
//    // 写一个方法，可以获取客户希望订购的的披萨种类
//    private String getType(){
//        try {
//            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
//            System.out.println("input pizza type: ");
//            String str = strin.readLine();
//            return str;
//        } catch (IOException e){
//            e.printStackTrace();
//            return "";
//        }
//    }
//}
//

public class OrderPizza {

    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory){
        String orderType = ""; //用户输入
        this.simpleFactory = simpleFactory;

        do{
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购披萨失败");
                break;
            }

        }while(true);
    }

    // 写一个方法，可以获取客户希望订购的的披萨种类
    private String getType(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type: ");
            String str = strin.readLine();
            return str;
        } catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }
}
