package 设计模式.单例模式;

public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton03 singleton = Singleton03.getInstance();
        Singleton03 singleton03 = Singleton03.getInstance();
        System.out.println(singleton == singleton03);
        System.out.println(singleton.hashCode());
        System.out.println(singleton03.hashCode());
    }
}

// 懒汉式（线程不安全）
class Singleton03{
    private Singleton03(){}

    private static Singleton03 instance;

    //提供一个静态的公有方法，当使用到该方法时，采取创建instance
    //即懒汉式
    public static Singleton03 getInstance(){
        if (instance == null){
            instance = new Singleton03();
        }
        return instance;
    }
}
