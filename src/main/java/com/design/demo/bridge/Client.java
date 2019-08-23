package com.design.demo.bridge;

/**
 * @author: GuanBin
 * @date: Created in 下午10:40 2019/8/23
 */
public class Client {
    public static void main(String[] args) {

        UrbanRoad carRunUrbanRD = new UrbanRoad(new CarRun(), 90,2);
        UrbanRoad busRunUrbanRD = new UrbanRoad(new BusRun(), 60,2);
        UrbanRoad bikeRunUrbanRD = new UrbanRoad(new BikeRun(), 10,2);

        carRunUrbanRD.runDistance();
        busRunUrbanRD.runDistance();
        bikeRunUrbanRD.runDistance();
    }
}
