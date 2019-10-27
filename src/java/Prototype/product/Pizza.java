package Prototype.product;

public abstract class Pizza implements Cloneable{
    String name;
    String daugh;
    String sauce;
    public void prepare() {
        System.out.println();
    }

    public void bake() {
        System.out.println(name+" bake");
    }

    public void box() {
        System.out.println(name+" box");
    }

    public void cut() {
        System.out.println(name+" cut");
    }
    public String toString() {
        return this.getClass().getName()+"{" +
                "name='" + name + '\'' +
                ", daugh='" + daugh + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }
}
