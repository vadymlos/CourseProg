package HW2;

public abstract class Shape {
    abstract double calculatePerimetr();
    abstract double calculateArea();

    public static void main(String[] args) {
        Point a = new Point(5,6);
        Point b = new Point(2,6);
        Point c = new Point(5,9);

       // Point.calculationDistance(a, b);
        Triangle triangle = new Triangle(a, b, c);
        System.out.println("Preimetr: " + triangle.calculatePerimetr());
        System.out.println("Sqr: " + triangle.calculateArea());

    }

}
