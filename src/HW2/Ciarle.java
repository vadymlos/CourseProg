package HW2;

public class Ciarle extends Shape {
    private Point a;
    private Point b;

    public Ciarle(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Ciarle() {

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

    @Override
    double calculatePerimetr() {
        return 2 * Math.PI * Point.calculationDistance(b, a);
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(Point.calculationDistance(b, a), 2);
    }

    @Override
    public String toString() {
        return "Ciarlke{" + "a=" + a + ", b=" + b + '}';
    }
}
