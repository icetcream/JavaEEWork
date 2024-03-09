package cn.zust.edu.cn;

import java.util.ArrayList;
import java.util.List;

public class ShapeManager {
    private List<IShape> shapes = new ArrayList<>();

    void addShape(IShape shape) {
        shapes.add(shape);
    }

    void delShape(IShape shape) {
        shapes.remove(shape);
    }

    void drawShapes() {
        for (IShape shape : shapes) {
            shape.draw();
        }
    }
}

