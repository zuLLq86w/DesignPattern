package 设计原则.inversion;

import org.jetbrains.annotations.NotNull;

// 依赖倒转原则.txt
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}


class Email{
    public String getInfo(){
        return "电子邮件信息: Hello World";
    }
}

class WeiXin{
    public String getInfo(){
        return "微信信息: Hello World";
    }
}

//完成Person接收消息的功能
//方式1分析
//1.简单，比较容易想到
//2.如果我们获取的对象是微信，短信等等，则新增类，同时Person也要增加相应的接受方法
//3.解决思路：引入一个抽象的接口IReceiver，表示接收着，这样Person类与IReceiver发生依赖
//    因为Email，WeiXin 等等属于接收的范围，他们各自实现IReceiver 接口就ok， 这样我们就符合依赖倒转原则
class Person{
    public void receive(@NotNull Email email){
        System.out.println(email.getInfo());
    }
    public void receive(@NotNull WeiXin weixin){
        System.out.println(weixin.getInfo());
    }
}