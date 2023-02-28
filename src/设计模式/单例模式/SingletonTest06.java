package 设计模式.单例模式;

public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton06 singleton06 = Singleton06.getInstance();
        Singleton06 singleton = Singleton06.getInstance();
        System.out.println(singleton == singleton06);
        System.out.println(singleton.hashCode());
    }
}


// 双重检查
class Singleton06{
    private static volatile Singleton06 instance;
    private Singleton06(){

    }

    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
    public static Singleton06 getInstance(){
        if (instance == null){
            synchronized (Singleton06.class){
                if (instance == null){
                    instance = new Singleton06();
                }
            }
        }
        return instance;
    }
}
