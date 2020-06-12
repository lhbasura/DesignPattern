package Decoration.decorator;

import Decoration.Food;

/**
 * 所有装饰器的父类
 */
public abstract class CondimentDecorator implements Food {
    /**
     * 被装饰者
     */
    protected Food beverage;

    /**
     *
     * @param beverage 被装饰者
     */
    public CondimentDecorator(Food beverage)
    {
        this.beverage=beverage;
    }

}
