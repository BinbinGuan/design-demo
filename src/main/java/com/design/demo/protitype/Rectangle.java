package com.design.demo.protitype;

/**
 * @author: GuanBin
 * @date: Created in 下午5:40 2019/8/5
 */
public class Rectangle extends Shape {


    public Rectangle() {
        setType("Rectangle");
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
