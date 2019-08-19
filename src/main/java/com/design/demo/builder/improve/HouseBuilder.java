package com.design.demo.builder.improve;

/**
 * @author: GuanBin
 * @date: Created in 下午12:33 2019/7/28
 * 抽象的建造者
 */
public abstract class HouseBuilder {

    protected House house = new House();

    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void buildRoofted();

    public House buildHouse() {
        return house;
    }
}
