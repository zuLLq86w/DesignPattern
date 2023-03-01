package 设计模式.建造者模式.Demo;

public abstract class AbstractHouse {

    // 打地基
    public void buildBasic(){};

    // 砌墙
    public void buildWalls(){};

    // 封顶
    public void roofed(){};

    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    };
}
