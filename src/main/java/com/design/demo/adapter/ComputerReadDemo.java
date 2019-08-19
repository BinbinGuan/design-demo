package com.design.demo.adapter;

/**
 * @author: GuanBin
 * @date: Created in 下午5:04 2019/8/7
 */
public class ComputerReadDemo {

    public static void main(String[] args) {
        Computer computer = new ThinkpadComputer();
        SDCardImpl sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));
        System.out.println("=========================");
        TFCardImpl tfCard = new TFCardImpl();
        SDAdapterTF sdAdapterTF = new SDAdapterTF(tfCard);
        System.out.println(computer.readSD(sdAdapterTF));
    }
}
