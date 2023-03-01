package 设计模式.建造者模式.Demo;

public class CommonHouse extends AbstractHouse {


    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子打砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }

    @Override
    public void build() {
        super.build();
    }
}
