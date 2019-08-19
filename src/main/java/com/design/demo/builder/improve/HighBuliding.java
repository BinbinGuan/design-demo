package com.design.demo.builder.improve;

/**
 * @author: GuanBin
 * @date: Created in 下午12:38 2019/7/28
 */
public class HighBuliding extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("高楼房子打基100米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼房子砌墙1米");

    }

    @Override
    public void buildRoofted() {
        System.out.println("高楼透明");

    }
}
