package Decoration.Decorator;

import Decoration.Food;

public abstract class CondimentDecorator implements Food {

    protected Food beverage;
    public CondimentDecorator(Food beverage)
    {
        this.beverage=beverage;
    }

}
