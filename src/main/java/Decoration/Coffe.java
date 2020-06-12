package Decoration;

public class Coffe extends Beverage {
    @Override
    public String getDescription() {
        return "Coffe";
    }
    @Override
    public double cost() {
        switch (this.getSize())
        {
            case BIG:
                return 15;
            case MIDDLE:
                return 10;
            case SMALL:
                return 8;
        }
        return 0;
    }
}
