package Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author asura
 * @date 2020/6/12 17:38
 * @description 温度终端，展示温度数值
 */

public class TemperatureTerminal implements Terminal {

    private float temperature;


    @Override
    public void update(Observable o, Object arg) {
        this.temperature=((WeatherData) o).getTemperature();
        display();
    }

    @Override
    public void display(){
        System.out.println(String.format("temperature:%f°C",this.temperature));
    }
}
