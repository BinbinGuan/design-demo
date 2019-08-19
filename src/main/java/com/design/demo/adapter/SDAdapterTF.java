package com.design.demo.adapter;

/**
 * @author: GuanBin
 * @date: Created in 上午10:45 2019/8/8
 */
public class SDAdapterTF implements SDCard {

    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    /**
     * 读取TF卡也走SDCard的readSD方法，但是具体实现仍然走的是TFCard的readTF方法
     * @return
     */
    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTF();
    }

    @Override
    public int writeSD(String msg) {
        System.out.println("adapter write tf card");
        return tfCard.writeTF(msg);
    }
}
