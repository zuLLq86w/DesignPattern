package 设计模式.单例模式;

public class SingletonTest07 {
    public static void main(String[] args) {

    }
}


class Singleton07{
    private Singleton07(){}

    //静态内部类，该类中有一个静态属性Singleton
    private static class SingletonInstance{
        private static final Singleton07 INSTANCE = new Singleton07();
    }


    public static synchronized Singleton07 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
