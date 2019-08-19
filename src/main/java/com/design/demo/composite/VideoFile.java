package com.design.demo.composite;

/**
 * @author: GuanBin
 * @date: Created in 下午10:50 2019/8/18
 */
public class VideoFile extends File {
    public VideoFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是影像文件，文件名："+super.name);
    }
}
