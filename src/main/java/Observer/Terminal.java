package Observer;

import java.util.Observer;

/**
 * @author asura
 * @date 2020/6/12 17:26
 * @description 终端接口，作为观察者，不同终端会有不同实现
 */
public interface Terminal extends Observer {
    public void display();
}
