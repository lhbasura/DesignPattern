package Observer;

import org.junit.Test;

/**
 * @author asura
 * @date 2020/6/12 17:21
 * @description 测试代码
 */
public class ObserverTest {
    @Test
    public void test(){
        WeatherData weatherData=new WeatherData();
        weatherData.addObserver(new WindTerminal());
        weatherData.addObserver(new PressureTerminal());
        weatherData.addObserver(new TemperatureTerminal());
        weatherData.setMeasurements(1f,1f,"东风");
    }

}
