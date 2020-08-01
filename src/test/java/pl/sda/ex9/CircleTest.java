package pl.sda.ex9;

import org.junit.jupiter.api.Test;
import pl.sda.ex10.MoveDirection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {
    @Test
    public void testRightCharacteristics(){
        Point2D center = new Point2D(0,0);
        Point2D point = new Point2D(1,0);
        Circle circle = new Circle(center, point);
        double r = circle.getRadius();

        assertEquals(1.0d, r);
        assertEquals(2*Math.PI*r, circle.getPerimeter());
        assertEquals(Math.PI*r*r, circle.getArea());
    }

    @Test
    public void testRightCharacteristicsAfterMove(){
        Point2D center = new Point2D(0,0);
        Point2D point = new Point2D(0,1);
        Circle circle = new Circle(center, point);
        double r = circle.getRadius();

        assertEquals(1.0d, r);
        assertEquals(2*Math.PI*r, circle.getPerimeter());
        assertEquals(Math.PI*r*r, circle.getArea());

        MoveDirection md = new MoveDirection(2.5d, -3.0);
        circle.move(md);
        assertEquals(2.5d,circle.getCenter().getX());
        assertEquals(-2d,circle.getPoint().getY());
    }
}
