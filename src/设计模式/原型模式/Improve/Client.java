package 设计模式.原型模式.Improve;


public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep2 = (Sheep)sheep.clone();

        System.out.println(sheep);
        System.out.println(sheep2);
    }
}
