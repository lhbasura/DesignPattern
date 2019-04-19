package FactoryMethod.product;

public abstract class Pizza {
    String name;
    String daugh;
    String sauce;
    public abstract void cut();
    public abstract void prepare();
    public abstract void bake();
    public abstract void box();

    @Override
    public String toString() {
        return this.getClass().getName()+"{" +
                "name='" + name + '\'' +
                ", daugh='" + daugh + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }
}
