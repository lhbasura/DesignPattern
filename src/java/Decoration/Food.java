package Decoration;

//装饰器和被装饰者需要共同继承的接口
public interface Food {
    public String getDescription();
    public double cost();
    public Size getSize();
}
