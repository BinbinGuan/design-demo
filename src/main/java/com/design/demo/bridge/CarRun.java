package com.design.demo.bridge;

/**
 * @author: GuanBin
 * @date: Created in 下午10:24 2019/8/23
 */
public class CarRun implements RunApi {

    @Override
    public void run(int speed, int hour) {
        System.out.println("The car ran " + speed * hour + " kilometers at a  speed of " + speed + " km/h per hour.");
    }
}
