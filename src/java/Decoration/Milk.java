package Decoration;

public class Milk extends Beverage {
    @Override
    public String getDescription() {
        return "Milk";
    }

    @Override
    public double cost() {
        switch (this.getSize())
        {
            case BIG:
                return 10;
            case MIDDLE:
                return 8;
            case SMALL:
                return 5;
        }
        return 0;
    }
}
