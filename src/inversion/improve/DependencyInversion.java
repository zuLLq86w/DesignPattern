package inversion.improve;

import org.jetbrains.annotations.NotNull;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}


//定义接口
interface IReceiver {
    public String getInfo();
}


class Email implements IReceiver {
    public String getInfo() {
        return "电子邮件信息: Hello World";
    }
}

class WeiXin implements IReceiver {
    public String getInfo() {
        return "微信信息: Hello World";
    }
}

class Person {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }

}