package 设计模式.适配器模式.接口适配器;

public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter =  new AbsAdapter(){
            @Override
            public void m1(){
                System.out.println("使用了m1的方法");
            }
        };
        absAdapter.m1();
    }
}
