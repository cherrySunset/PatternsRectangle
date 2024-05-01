package edu.pattern.shapes.action.factory;

import edu.pattern.shapes.ShapeValidator;
import edu.pattern.shapes.entity.Point;
import edu.pattern.shapes.entity.Rectangle;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.*;

public class ShapeValidatorTest {

    @Test
    public void testValidRectangle() {
        Point topLeft = new Point(0, 0);
        Point bottomRight = new Point(10, 10);
        Rectangle rectangle = new Rectangle(1, topLeft, bottomRight);
        assertTrue(ShapeValidator.validateRectangle(rectangle));
    }

    @Test
    public void testInvalidRectangle() {
        Point topLeft = new Point(0, 0);
        Point bottomRight = new Point(0, 0);
        Rectangle rectangle = new Rectangle(1, topLeft, bottomRight);
        assertFalse(ShapeValidator.validateRectangle(rectangle));
    }
}
