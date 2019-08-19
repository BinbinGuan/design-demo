package com.design.demo.protitype;

import java.util.Hashtable;

/**
 * @author: GuanBin
 * @date: Created in 下午5:44 2019/8/5
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape clone = null;
        try {
            Shape cachedShape = shapeMap.get(shapeId);
            clone = (Shape) cachedShape.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }


    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);


        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(), square);
    }


}
