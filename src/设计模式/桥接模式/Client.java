package 设计模式.桥接模式;

public class Client {
    public static void main(String[] args) {
        // 获取折叠式手机（样式+品牌）
        Phone phone1 = new FolderPhone(new Vivo());
        phone1.open();
        phone1.call();
        phone1.close();

        Phone phone2 = new FolderPhone(new XiaoMi());
        phone2.open();
        phone2.call();
        phone2.close();


    }
}
