package qa_for_everyone;

import java.lang.reflect.Array;

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
