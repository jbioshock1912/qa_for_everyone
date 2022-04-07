package codewars;

/*I'm new to coding and now I want to get the sum of two arrays...actually the sum of all their elements. I'll appreciate for your help.
P.S. Each array includes only integer numbers. Output is a number too.*/
public class SumArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int value : arr1) {
            sum = sum + value;
        }

        for (int value : arr2) {
            sum = sum + value;
        }
        return sum;
    }
}
