package com.design.demo.composite;

/**
 * @author: GuanBin
 * @date: Created in 下午10:50 2019/8/18
 */
public class TextFile extends File {
    public TextFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是文本文件，文件名："+super.name);
    }
}
