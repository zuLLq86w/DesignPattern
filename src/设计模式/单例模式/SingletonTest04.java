package 设计模式.单例模式;

public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton04 singleton = Singleton04.getInstance();
        Singleton04 singleton04 = Singleton04.getInstance();
        System.out.println(singleton == singleton04);
    }
}

//懒汉式（线程安全，同步方法）
class Singleton04{
    private Singleton04(){}

    private static Singleton04 instance;

    //提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
    public static synchronized Singleton04 getInstance(){
        if (instance == null){
            instance = new Singleton04();
        }
        return instance;
    }
}
