package Decoration.Decorator;

import Decoration.Food;
import Decoration.Size;


public class Sugar extends CondimentDecorator {
    public Sugar(Food beverage) {
        super(beverage);
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+"+Sugar";
    }

    @Override
    public double cost() {
        double cost=beverage.cost();
        switch (getSize())
        {
            case BIG:
                cost+=1;
                break;
            case MIDDLE:
                cost+=0.8;
                break;
            case SMALL:
                cost+=0.5;
                break;

        }
        return cost;
    }

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
