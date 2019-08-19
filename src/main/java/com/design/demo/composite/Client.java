package com.design.demo.composite;

/**
 * @author: GuanBin
 * @date: Created in 下午10:53 2019/8/18
 */
public class Client {

    public static void main(String[] args) {
        Folder folder = new Folder("总文件夹");
        folder.add(new TextFile("text.txt"));
        folder.add(new ImageFile("image.jpg"));


        Folder testFolder = new Folder("test文件夹");
        testFolder.add(new TextFile("test1.txt"));
        testFolder.add(new ImageFile("test2.jpg"));
        testFolder.add(new VideoFile("test3.rmvb"));

        //把test文件夹添加到总文件夹下
        folder.add(testFolder);
        //遍历
        folder.display();
        System.out.println("*****************************");
        //添加
        TextFile addFile = new TextFile("add.txt");
        testFolder.add(addFile);
        folder.display();
        System.out.println("*****************************");
        //删除testFolder
        folder.remove(testFolder);
        folder.display();

    }


}
