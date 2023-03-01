package 设计模式.工厂模式.抽象工厂.order;

public class PizzaStore {
    public static void main(String[] args) {
        //创建北京口味的各种披萨
        OrderPizza orderPizza = new OrderPizza(new BJFactory());
    }
}
