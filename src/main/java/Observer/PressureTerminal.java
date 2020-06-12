package Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author asura
 * @date 2020/6/12 17:28
 * @description 压力终端，展示压力数据
 */
public class PressureTerminal implements Terminal {
    private float pressure;
    @Override
    public void update(Observable o, Object arg) {
        this.pressure=((WeatherData) o).getPressure();
        display();
    }

    @Override
    public void display(){
        System.out.println(String.format("Pressure:%f°C",this.pressure));
    }
}
