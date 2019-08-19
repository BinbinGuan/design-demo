package com.design.demo.adapter;

/**
 * @author: GuanBin
 * @date: Created in 下午4:53 2019/8/7
 */
public class ThinkpadComputer implements Computer {
    @Override
    public String readSD(SDCard sdCard) {
        if(sdCard == null){
            throw new NullPointerException("sd card null");
        }
        return sdCard.readSD();
    }
}
