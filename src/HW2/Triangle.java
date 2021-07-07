package HW2;

import HW1.Trian;

import static HW2.Point.calculationDistance;

public class Triangle extends Shape {
    private Point a;
    private Point b;
    private Point c;

    public Triangle (Point a, Point b, Point c){
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Triangle(){
        super();
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    double calculatePerimetr() {
        return calculationDistance(a, b) + calculationDistance(a, c) + calculationDistance(c, b);
    }

    @Override
    double calculateArea() {
        double halfper = calculatePerimetr() / 2.0;
        return Math.sqrt(halfper * (halfper - Point.calculationDistance(a, b)) * (halfper - Point.calculationDistance(b, c))
                * (halfper - Point.calculationDistance(c, a)));
    }

    @Override
    public String toString() {

        return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
    }
}
