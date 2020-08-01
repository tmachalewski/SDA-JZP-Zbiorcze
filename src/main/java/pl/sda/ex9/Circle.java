package pl.sda.ex9;

import pl.sda.ex10.Movable;
import pl.sda.ex10.MoveDirection;
import pl.sda.ex11.Resizable;

public class Circle implements Movable, Resizable {
    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public Point2D getCenter() {
        return center;
    }

    public void setCenter(Point2D center) {
        this.center = center;
    }

    public Point2D getPoint() {
        return point;
    }

    public void setPoint(Point2D point) {
        this.point = point;
    }

    public double getRadius(){
        double diffX = center.getX()-point.getX();
        double diffY = center.getY()-point.getY();
        return Math.sqrt(diffX*diffX+diffY*diffY);
    }

    public double getPerimeter(){

        return 2*Math.PI*getRadius();
    }

    public double getArea(){

        double r = getRadius();
        return Math.PI*r*r;
    }

    @Override
    public void move(MoveDirection md) {
        center.move(md);
        point.move(md);
    }

    @Override
    public void resize(double resizeFactor) {
        double diffX = point.getX()-center.getX();
        double diffY = point.getY()-center.getY();
        diffX*=resizeFactor; diffY*=(resizeFactor-1.0d);
        MoveDirection md = new MoveDirection(diffX, diffY);
        point.move(md);
    }
}
