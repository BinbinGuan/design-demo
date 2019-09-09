package com.design.demo.decorator;

/**
 * @author: GuanBin
 * @date: Created in 上午12:07 2019/9/9
 *
 * //装饰类
 */
public abstract class BuildDecorator implements Building {
    protected Building building;

    public BuildDecorator(Building building) {
        this.building = building;
    }

    @Override
    public void bulid() {
        building.bulid();
    }
}
