package com.design.demo.decorator;

/**
 * @author: GuanBin
 * @date: Created in 上午12:11 2019/9/9
 */
public class LowestDecorator extends BuildDecorator {
    public LowestDecorator(Building building) {
        super(building);
    }

    @Override
    public void bulid() {
        building.bulid();
        System.out.println("It is lowest building");
    }
}
