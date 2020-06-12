package Strategy;

import lombok.Data;

@Data
public abstract class Car {
    private Driver driver;
    String name;
    public void drive(){
        driver.start(this.name);
    }
}
