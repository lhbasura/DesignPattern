package FactoryMethod.product;

public class NyCheesePizza extends Pizza{

    @Override
    public void cut() {
        System.out.println("New York cut");
    }

    public NyCheesePizza()
    {
        this.name="NyCheese Pizza";
        this.daugh="NyCheese daugh";
        this.sauce="NyCheese sauce";
    }

    @Override
    public void prepare() {

    }

    @Override
    public void bake() {
        System.out.println("New York bake");
    }

    @Override
    public void box() {
        System.out.println("New York box");
    }
}
