package observer;

import java.util.Observable;
import java.util.Observer;

public class Terminal implements Observer {

    private float temperature;


    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            this.temperature=((WeatherData) o).getTemperature();
        }
        display();
    }
    public void display(){
        System.out.println(String.format("temperature:%f°C",this.temperature));
    }
}
