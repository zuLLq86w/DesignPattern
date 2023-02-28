package 设计模式.单例模式;

public class SingletonTest05 {
    public static void main(String[] args) {

    }
}

class Singleton05{
    private static Singleton05 instance;

    private Singleton05(){

    }

    public static Singleton05 getInstance(){
        if(instance == null){
            synchronized (Singleton05.class){
                instance = new Singleton05();
            }
        }
        return instance;
    }
}
