package 设计模式.建造者模式.Improve;

public class HighBuilding extends HouseBuilder{

    @Override
    public void buildBasic() {
        System.out.println("高楼打地基100米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙100米");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶");
    }
}
