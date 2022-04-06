package qa_for_everyone;

import org.junit.Assert;
import org.junit.Test;

public class ArrayCalculation_2Test {


    private int[] array = new int[]{9, 0, -9, 5, 3, 2};
    private int[][] twoDimArray = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
    private int[][] twoDimArray2 = {{-150, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, 100}};

    @Test
    public void getSum() {
        int result = 10;
        Assert.assertEquals(result, ArrayCalculation_2.getSum(array));
    }

    @Test
    public void getMax() {
        int result = 9;
        Assert.assertEquals(result, ArrayCalculation_2.getMax(array));
    }

    @Test
    public void getMin() {
        int result = -9;
        Assert.assertEquals(result, ArrayCalculation_2.getMin(array));
    }

    @Test
    public void getAverageArithmetic() {
        int result = 2;
        Assert.assertEquals(result, ArrayCalculation_2.getAverageArithmetic(array));
    }

    @Test
    public void getSumTwoDimArrayTest() {
        int result = 24;
        Assert.assertEquals(result, ArrayCalculation_2.getSum(twoDimArray));
    }

    @Test
    public void getMaxTwoDimArrayTest() {
        int result = 9;
        Assert.assertEquals(result, ArrayCalculation_2.getMax(twoDimArray));
    }

    @Test
    public void getMaxTwoDimArrayTest2() {
        int result = 100;
        Assert.assertEquals(result, ArrayCalculation_2.getMax(twoDimArray2));
    }

    @Test
    public void getMinTwoDimArrayTest() {
        int result = -6;
        Assert.assertEquals(result, ArrayCalculation_2.getMin(twoDimArray));
    }

    @Test
    public void getMinTwoDimArrayTest2() {
        int result = -150;
        Assert.assertEquals(result, ArrayCalculation_2.getMin(twoDimArray2));
    }

    @Test
    public void getCountTwoDimArrayTest() {
        int result = 15;
        Assert.assertEquals(result, ArrayCalculation_2.getCount(twoDimArray2));
    }
}