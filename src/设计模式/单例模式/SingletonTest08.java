package 设计模式.单例模式;

public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton08 singleton = Singleton08.INSTANCE;
        Singleton08 singleton1 = Singleton08.INSTANCE;
        System.out.println(singleton == singleton1);

    }
}

//使用枚举，可以实现单例
enum Singleton08{
    INSTANCE;
    public void sayOK(){
        System.out.println("ok");
    }
}
