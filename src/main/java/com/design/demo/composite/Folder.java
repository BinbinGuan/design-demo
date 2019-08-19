package com.design.demo.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: GuanBin
 * @date: Created in 下午10:30 2019/8/18
 */
public class Folder extends File {

    private List<File> files;

    public Folder(String name) {
        super(name);
        this.files = new ArrayList<>();
    }

    /**
     * 浏览文件夹中的文件信息
     */
    @Override
    public void display() {
        for (File file : files) {
            file.display();
        }
    }

    /**
     * 向文件夹中添加文件
     *
     * @param file
     */
    public void add(File file) {
        files.add(file);
    }


    /**
     * 从文件夹中删除文件
     *
     * @param file
     */
    public void remove(File file) {
        files.remove(file);
    }
}
