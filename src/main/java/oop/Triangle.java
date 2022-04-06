package oop;

public class Triangle extends AbstractFigure {

   private double lengthFirstSide;
   private double lengthSecondSide;
   private double lengthThirdSide;

    Triangle(double lengthFirstSide, double lengthSecondSide, double lengthThirdSide) {
        this.lengthFirstSide = lengthFirstSide;
        this.lengthSecondSide = lengthSecondSide;
        this.lengthThirdSide = lengthThirdSide;
    }

    @Override
    String getFigureName() {
        return "Треугольник";
    }

    @Override
    public double calculatePerimeter() {
        return lengthFirstSide + lengthSecondSide + lengthThirdSide;
    }

    @Override
    public double calculateArea() {
        double halfPerimeter = calculatePerimeter() / 2;
        double triangleArea = Math.sqrt(halfPerimeter *
                (halfPerimeter - lengthFirstSide) *
                (halfPerimeter * lengthSecondSide) *
                (halfPerimeter * lengthThirdSide));
        return triangleArea;
    }
}
