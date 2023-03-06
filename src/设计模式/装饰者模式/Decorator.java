package 设计模式.装饰者模式;

public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink){
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes(){
        return super.getDes() + " " + super.getPrice() + " && " + drink.getDes();
    }
}
