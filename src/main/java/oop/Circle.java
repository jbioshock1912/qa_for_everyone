package oop;

public class Circle extends AbstractFigure {
    private static final double PI = 3.14;
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * radius * PI;
    }

    @Override
    public double calculateArea() {
        return Math.pow(radius, 2) * PI;
    }

    @Override
    String getFigureName() {
        return "Круг";
    }
}
