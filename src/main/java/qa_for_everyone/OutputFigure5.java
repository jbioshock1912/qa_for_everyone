package qa_for_everyone;

/*
Таск5 Нарисовать фигуры (цикл в фикле)
        Задача №1

        0  1  2  3  4  5  6  7  8  9
        0  1  2  3  4  5  6  7  8
        0  1  2  3  4  5  6  7
        0  1  2  3  4  5  6
        0  1  2  3  4  5
        0  1  2  3  4
        0  1  2  3
        0  1  2
        0  1
        0


        Задача №2

        0  1  2  3  4  5  6  7  8  9
        0  1  2  3  4  5  6  7  8
        0  1  2  3  4  5  6  7
        0  1  2  3  4  5  6
        0  1  2  3  4  5
        0  1  2  3  4
        0  1  2  3
        0  1  2
        0  1
        0


        Задача №3

        9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
        8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
        7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
        6 5 4 3 2 1 0 1 2 3 4 5 6
        5 4 3 2 1 0 1 2 3 4 5
        4 3 2 1 0 1 2 3 4
        3 2 1 0 1 2 3
        2 1 0 1 2
        1 0 1
        0
*/


public class OutputFigure5 {

    public static void drawLeftTriangle() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void drawRightTriangle() {
        String space = " ";
        for (int i = 0; i < 10; i++) {
            System.out.print(space);
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
            space = space + "  ";
            System.out.println();
        }
    }

    public static void drawTriangle() {
        String space = " ";
        for (int i = 0; i < 10; i++) {
            System.out.print(space);
            for (int j = 9 - i; j > -1; j--) {
                System.out.print(j + " ");
            }
            for (int k = 1; k < 10 - i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
            space = space + "  ";
        }
    }


    public static void main(String[] args) {
        drawLeftTriangle();
        drawRightTriangle();
        drawTriangle();
    }

}


