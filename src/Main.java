import observer.Terminal;
import observer.WeatherData;

public class Main {
    public static void main(String[]args)
    {
        WeatherData weatherData=new WeatherData();
        Terminal terminal=new Terminal();
        weatherData.addObserver(terminal);
        weatherData.setMeasurements(1f,2f,"西风");
    }
}
