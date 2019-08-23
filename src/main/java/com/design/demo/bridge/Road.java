package com.design.demo.bridge;

/**
 * @author: GuanBin
 * @date: Created in 下午10:30 2019/8/23
 */
public abstract class Road {
    protected RunApi runApi;

    public Road(RunApi runApi) {
        this.runApi = runApi;
    }

    public abstract void runDistance();
}
