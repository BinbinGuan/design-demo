package com.design.demo.builder.improve;

/**
 * @author: GuanBin
 * @date: Created in 下午12:37 2019/7/28
 */
public class CommonHouse extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("普通房子打基5米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙10cm");
    }

    @Override
    public void buildRoofted() {
        System.out.println("普通房子封顶");

    }
}
