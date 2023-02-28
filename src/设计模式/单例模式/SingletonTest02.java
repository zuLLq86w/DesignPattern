package 设计模式.单例模式;

public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton02 singleton = Singleton02.getInstance();
        Singleton02 singleton01 = Singleton02.getInstance();
        System.out.println(singleton == singleton01);
    }
}

//饿汉式（静态代码块）
class Singleton02{

    private Singleton02(){

    }

    private static Singleton02 instance;


    // 静态代码块中，创建单例对象
    static {
        instance = new Singleton02();
    }

    public static Singleton02 getInstance(){
        return instance;
    }

}
