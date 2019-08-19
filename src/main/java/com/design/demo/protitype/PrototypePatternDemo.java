package com.design.demo.protitype;

/**
 * @author: GuanBin
 * @date: Created in 下午6:03 2019/8/5
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cloneShape1 = (Shape) ShapeCache.getShape("1");
        System.out.println(cloneShape1.getType());


        Shape cloneShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println(cloneShape2.getType());


        Shape cloneShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println(cloneShape3.getType());

    }
}
