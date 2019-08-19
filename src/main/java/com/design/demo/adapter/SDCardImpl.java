package com.design.demo.adapter;

/**
 * @author: GuanBin
 * @date: Created in 下午4:45 2019/8/7
 */
public class SDCardImpl implements SDCard {

    @Override
    public String readSD() {
        String msg="sdcard read a msg : Hello word sd";
        return msg;
    }

    @Override
    public int writeSD(String msg) {
        System.out.println("sd card write msg:" + msg);
        return 1;
    }
}
