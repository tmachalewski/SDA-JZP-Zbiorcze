package pl.sda.ex9;

public class Circle {
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
}
