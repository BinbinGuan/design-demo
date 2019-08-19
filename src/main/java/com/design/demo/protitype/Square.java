package com.design.demo.protitype;

/**
 * @author: GuanBin
 * @date: Created in 下午5:42 2019/8/5
 */
public class Square extends Shape {

    public Square() {
        setType("Square");
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
