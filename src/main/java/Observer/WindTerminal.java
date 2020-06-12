package Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author asura
 * @date 2020/6/12 17:25
 * @description
 */
public class WindTerminal implements Observer,Terminal{
    private String wind;

    @Override
    public void update(Observable o, Object arg) {
        this.wind=((WeatherData) o).getWind();
        display();
    }

    @Override
    public void display(){
        System.out.println(String.format("wind:%s°C",this.wind));
    }
}
