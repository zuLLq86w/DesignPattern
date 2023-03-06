package 设计模式.装饰者模式;


// 具体的Decorator，这里就是调味品
public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setDes("巧克力");
        setPrice(3.0f); // 巧克力的价格
    }
}
