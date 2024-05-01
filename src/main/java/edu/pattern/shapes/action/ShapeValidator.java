package edu.pattern.shapes;

import edu.pattern.shapes.entity.Point;
import edu.pattern.shapes.entity.Rectangle;

public class ShapeValidator {
    public static double getRectangleWidth(Rectangle rectangle) {
        Point topLeft = rectangle.getTopLeft();
        Point bottomRight = rectangle.getBottomRight();
        return Math.abs(topLeft.getX() - bottomRight.getX());
    }

    public static double getRectangleHeight(Rectangle rectangle) {
        Point topLeft = rectangle.getTopLeft();
        Point bottomRight = rectangle.getBottomRight();
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    public static boolean validateRectangle(Rectangle rectangle) {
        double width = getRectangleWidth(rectangle);
        double height = getRectangleHeight(rectangle);

        if (width <= 0 || height <= 0) {
            return false;
        }
        return true;
    }
}