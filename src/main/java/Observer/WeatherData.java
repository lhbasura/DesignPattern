package Observer;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/**
 * @author asura
 * @date 2020/6/12 17:39
 * @description 风向终端，展示风向数值
 */

@Data
public class WeatherData  extends Observable {
    private String wind;
    private float temperature;
    private float pressure;

    public void setMeasurements(float temperature, float pressure, String wind)
    {
        this.setPressure(pressure);
        this.setWind(wind);
        this.setTemperature(temperature);
        this.setChanged();//必须调用setChanged方法将父类中的isChanged设置为true才能使改变生效
        this.notifyObservers();
    }
}
