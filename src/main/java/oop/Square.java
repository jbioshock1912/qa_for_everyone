package oop;

public class Square extends AbstractFigure {
    private double length;

    Square(double length) {
        this.length = length;
    }

    @Override
    String getFigureName() {
        return "Квадрат";
    }

    @Override
    public double calculatePerimeter() {
        return 4 * length;
    }

    @Override
    public double calculateArea() {
        return Math.pow(length, 2);
    }
}
