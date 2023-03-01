package 设计模式.建造者模式.Improve;

public class Client {
    public static void main(String[] args) {
        HouseDirector houseDirector = new HouseDirector(new CommonHouse());
        House house = houseDirector.constructHouse();

        System.out.println("输出流程");
        System.out.println(house.getBasic());

    }
}
