package com.design.demo.adapter;

/**
 * @author: GuanBin
 * @date: Created in 下午4:43 2019/8/7
 */
public interface SDCard {
    /**
     * 读取SD卡方法
     *
     * @return
     */
    String readSD();

    /**
     * 写入SD卡功能
     * @param msg
     * @return
     */
    int writeSD(String msg);
}
