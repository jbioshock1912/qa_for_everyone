package oop;

import java.util.ArrayList;
import java.util.List;

public class Starter {

    private List<AbstractFigure> myFigure = new ArrayList<>();

    private Circle bigCircle = new Circle(168.0);
    private Circle smallCircle = new Circle(14.5);
    private Rectangle bigRectangle = new Rectangle(87.4, 114.2);
    private Rectangle smallRectangle = new Rectangle(7.4, 2.2);
    private Square bigSquare = new Square(97.3);
    private Square smallSquare = new Square(12.1);
    private Triangle bigTriangle = new Triangle(214.4, 125.4, 128.5);
    private Triangle smallTriangle = new Triangle(8.9, 12.2, 1.4);

    private void start() {
        myFigure.add(bigCircle);
        myFigure.add(smallCircle);
        myFigure.add(bigCircle);
        myFigure.add(bigRectangle);
        myFigure.add(smallRectangle);
        myFigure.add(bigSquare);
        myFigure.add(smallSquare);
        myFigure.add(bigTriangle);
        myFigure.add(smallTriangle);
        for (AbstractFigure value : myFigure) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        Starter startFigure = new Starter();
        startFigure.start();
    }
}
