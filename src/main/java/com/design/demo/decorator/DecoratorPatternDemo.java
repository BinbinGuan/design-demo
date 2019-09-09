package com.design.demo.decorator;

/**
 * @author: GuanBin
 * @date: Created in 上午12:14 2019/9/9
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        //高层建筑的修饰类
        BuildDecorator highDecorator = new HighestDecorator(new HighBuilding());
        //低层建筑的修饰类
        BuildDecorator lowDecorator = new LowestDecorator(new Cottage());

        highDecorator.bulid();

        lowDecorator.bulid();
    }
}
