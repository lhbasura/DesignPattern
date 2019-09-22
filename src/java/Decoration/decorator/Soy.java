package Decoration.decorator;


import Decoration.Food;
import Decoration.Size;

public class Soy extends CondimentDecorator {
    public Soy(Food beverage) {
        super(beverage);
    }
    public String getDescription(){
        return beverage.getDescription()+"+Soy";
    }
    @Override
    public double cost() {
        double cost=beverage.cost();
        switch (getSize())
        {
            case BIG:
                cost+=0.5;
                break;
            case MIDDLE:
                cost+=0.3;
                break;
            case SMALL:
                cost+=0.2;
                break;

        }
        return cost;
    }

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
