package inversion.接口传递实现依赖;

public class Main {
    public static void main(String[] args) {
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(new ChangHong());
    }
}

interface IOpenAndClose{
    public void open(ITV tv); // 抽象方法，接收接口
}

interface ITV{
    public void play();
}

class ChangHong implements ITV{

    @Override
    public void play() {
        System.out.println("ChangHong TV Open ");
    }
}


class OpenAndClose implements IOpenAndClose{

    @Override
    public void open(ITV tv) {
        tv.play();
    }
}
