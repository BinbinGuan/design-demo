package com.design.demo.decorator;

/**
 * @author: GuanBin
 * @date: Created in 上午12:05 2019/9/9
 */
public class HighBuilding implements Building {
    @Override
    public void bulid() {
        System.out.println("build high building");
    }
}
