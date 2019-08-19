package com.design.demo.protitype;

/**
 * @author: GuanBin
 * @date: Created in 下午5:42 2019/8/5
 */
public class Circle extends Shape {

    public Circle() {
        setType("Circle");
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
