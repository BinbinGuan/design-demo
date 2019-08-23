package com.design.demo.bridge;

/**
 * @author: GuanBin
 * @date: Created in 下午10:34 2019/8/23
 */
public class UrbanRoad extends Road {

    private int speed;
    private int hour;

    public UrbanRoad(RunApi runApi, int speed, int hour) {
        super(runApi);
        this.speed = speed;
        this.hour = hour;
    }

    @Override
    public void runDistance() {
        runApi.run(speed, hour);
    }
}
