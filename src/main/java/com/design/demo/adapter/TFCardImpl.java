package com.design.demo.adapter;

/**
 * @author: GuanBin
 * @date: Created in 下午5:15 2019/8/7
 */
public class TFCardImpl implements TFCard {

    @Override
    public String readTF() {
        String msg ="tf card reade msg : hello word tf card";
        return msg;
    }

    @Override
    public int writeTF(String msg) {
        System.out.println("tf card write a msg : " + msg);
        return 1;
    }
}
