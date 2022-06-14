package qa_for_everyone;

/*
Такс2 Array
        Задача №1
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести сумму всех значений массива.
        Задача №2
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести максимальное значение массива.
        Задача №3
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести минимальное значение массива.
        Задача №4
        Дан массив:
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        необходимо вывести среднее арифметическое всех значений массива.
        Задача №5
        Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести сумму элементов массива.
        Задача №6
        Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести максимальное значение массива.
        Задача №7
        Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести количество элементов в массиве.
*/

public class ArrayCalculation_2 {

    public static int getSum(int[] myArray) {
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = myArray[i] + sum;
        }
        return sum;
    }

    public static int getMax(int[] myArray) {
        int max = myArray[0];
        for (int i = 0; i < myArray.length - 1; i++) {
            if (max < myArray[i + 1]) {
                max = myArray[i + 1];
            }
        }
        return max;
    }

    public static int getMin(int[] myArray) {
        int min = myArray[0];
        for (int i = 0; i < myArray.length - 1; i++) {
            if (min > myArray[i + 1]) {
                min = myArray[i + 1];
            }
        }
        return min;
    }

    public static int getAverageArithmetic(int[] myArray) {
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = myArray[i] + sum;
        }
        int averageArithmetic = sum / (myArray.length - 1);
        return averageArithmetic;
    }

    public static int getSum(int[][] myArray){
        int sum = 0;
        for (int i = 0; i < myArray.length; i ++){
            int lengthJ = myArray[i].length;
            for (int j = 0; j < lengthJ; j++){
                sum = sum + myArray[i][j];
            }
        }
        return sum;
    }

    public static int getMax(int[][] myArray){
        int max = myArray[0][0];
        for (int i = 0; i < myArray.length; i ++){
            int lengthJ = myArray[i].length;
            for (int j = 0; j < lengthJ; j++){
                if(max < myArray[i][j]){
                    max = myArray[i][j];
                }
            }
        }
        return max;
    }

    public static int getMin(int[][] myArray){
        int min = myArray[0][0];
        for (int i = 0; i < myArray.length; i ++){
            int lengthJ = myArray[i].length;
            for (int j = 0; j < lengthJ; j++){
                if(min > myArray[i][j]){
                    min = myArray[i][j];
                }
            }
        }
        return min;
    }

    public static int getCount(int[][] myArray){
        int count = 0;
        for (int i = 0; i < myArray.length; i ++){
            int lengthJ = myArray[i].length;
            for (int j = 0; j < lengthJ; j++){
                count++;
            }
        }
        return count;
    }






}
