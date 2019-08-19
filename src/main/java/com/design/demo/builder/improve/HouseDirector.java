package com.design.demo.builder.improve;

/**
 * @author: GuanBin
 * @date: Created in 下午12:40 2019/7/28
 *
 * 指挥者
 */
public class HouseDirector {

    private HouseBuilder houseBuilder=null;

    //构造方法，构造指挥者
    public HouseDirector (HouseBuilder houseBuilder) {
        this.houseBuilder= houseBuilder;
    }

    //set方法，构造指挥者
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.buildRoofted();

        return houseBuilder.house;
    }
}
