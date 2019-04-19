import Decoration.Beverage;
import Decoration.Coffe;
import Decoration.decorator.Soy;
import Decoration.decorator.Sugar;
import Decoration.Food;
import Decoration.Size;

public class Main {
    public static void main(String[]args)
    {
        Beverage drink=new Coffe();
        drink.setSize(Size.BIG);
        Food drink2=new Soy(drink);
        Food drink3=new Sugar(drink2);
        System.out.println(drink.getDescription()+":"+drink.cost());
        System.out.println(drink2.getDescription()+":"+drink2.cost());
        System.out.println(drink3.getDescription()+":"+drink3.cost());
    }
}
