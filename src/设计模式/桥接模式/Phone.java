package 设计模式.桥接模式;

public abstract class Phone {
    // 组合品牌
    private IBrand iBrand;

    public Phone(IBrand iBrand){
        this.iBrand = iBrand;
    }

    protected void open(){
        this.iBrand.open();
    }

    protected void close(){
        this.iBrand.close();
    }

    protected void call(){
        this.iBrand.call();
    }
}
