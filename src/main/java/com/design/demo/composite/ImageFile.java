package com.design.demo.composite;

/**
 * @author: GuanBin
 * @date: Created in 下午10:50 2019/8/18
 */
public class ImageFile extends File {
    public ImageFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是图像文件，文件名："+super.name);
    }
}
