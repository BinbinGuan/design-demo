package com.design.demo.composite;

/**
 * @author: GuanBin
 * @date: Created in 下午10:26 2019/8/18
 */
public abstract class File {
    String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void display();
}
