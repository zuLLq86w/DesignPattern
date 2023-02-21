package inversion.setter方法实现依赖;

public class Main {
    public static void main(String[] args) {
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(new ChangHong());
        openAndClose.open();
    }
}


interface IOpenAndClose{
    public void open(); // 抽象方法，接收接口

    public void setTv(ITV tv);
}

interface ITV{
    public void play();
}

class ChangHong implements ITV {

    @Override
    public void play() {
        System.out.println("ChangHong TV Open ");
    }
}


class OpenAndClose implements IOpenAndClose {
    public ITV tv; // 成员

    public void setTv(ITV tv){
        this.tv = tv;
    }
    public void open() {
        this.tv.play();
    }
}