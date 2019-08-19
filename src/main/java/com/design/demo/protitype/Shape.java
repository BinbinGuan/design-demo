package com.design.demo.protitype;

/**
 * @author: GuanBin
 * @date: Created in 下午5:17 2019/8/5
 */
public abstract class Shape implements Cloneable {


    private String id;

    private String type;

    abstract void draw();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
