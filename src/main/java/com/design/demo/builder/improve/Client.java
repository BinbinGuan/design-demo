package com.design.demo.builder.improve;

/**
 * @author: GuanBin
 * @date: Created in 下午12:47 2019/7/28
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();

        HouseDirector houseDirector = new HouseDirector(commonHouse);

        House house = houseDirector.constructHouse();


        System.out.println("*********************");


        HighBuliding highBuliding  = new HighBuliding();

        HouseDirector director = new HouseDirector(highBuliding);

        House house1 = director.constructHouse();

    }
}
