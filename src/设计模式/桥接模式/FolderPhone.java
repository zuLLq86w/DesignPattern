package 设计模式.桥接模式;

public class FolderPhone extends Phone {

    public FolderPhone(IBrand iBrand) {
        super(iBrand);
    }

    public void open() {
        super.open();
        System.out.println("折叠手机");
    }

    public void close() {
        super.close();
        System.out.println("折叠手机");
    }

    public void call() {
        super.call();
        System.out.println("折叠手机");
    }

}
