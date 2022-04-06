package oop;

public abstract class AbstractFigure {

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    abstract String getFigureName();

    @Override
    public String toString() {
        return String.format("%s: Площадь равна - %s, периметр равен - %s", getFigureName(), Math.round(calculateArea()), Math.round(calculatePerimeter()));
    }
}
