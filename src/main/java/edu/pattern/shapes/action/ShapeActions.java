package edu.pattern.shapes;

import edu.pattern.shapes.entity.Point;
import edu.pattern.shapes.entity.Rectangle;
import edu.pattern.shapes.entity.Shape;

public class ShapeActions {
    public static double calculatePerimeter(Shape shape) {
        if (shape instanceof Rectangle rectangle) {
            Point topLeft = rectangle.getTopLeft();
            Point bottomRight = rectangle.getBottomRight();
            double width = Math.abs(bottomRight.getX() - topLeft.getX());
            double height = Math.abs(bottomRight.getY() - topLeft.getY());
            return 2 * (width + height);
        }
        return 0;
    }

}