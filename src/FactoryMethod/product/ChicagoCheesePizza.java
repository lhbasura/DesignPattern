package FactoryMethod.product;

public class ChicagoCheesePizza extends Pizza{
    @Override
    public void cut() {
        System.out.println("Chicago cut");
    }

    public ChicagoCheesePizza()
    {
        this.name="Chicago Pizza";
        this.daugh="Chicago daugh";
        this.sauce="Chicago sauce";
    }
    @Override
    public void prepare() {

    }

    @Override
    public void bake() {
        System.out.println("Chicago bake");
    }

    @Override
    public void box() {
        System.out.println("Chicago box");
    }
}
