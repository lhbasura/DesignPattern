package observer;

import java.util.ArrayList;
import java.util.Observable;


public class WeatherData  extends Observable {
    private String wind;
    private float temperature;
    private float pressure;

    public String getWind() {
        return wind;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void setMeasurements(float temperature, float pressure, String wind)
    {
        this.setPressure(pressure);
        this.setWind(wind);
        this.setTemperature(temperature);
        this.setChanged();//必须调用setChanged方法将父类中的isChanged设置为true才能使改变生效
        this.notifyObservers();

    }
}
