package codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumArrayTest {

    @Test
    public void arrayPlusArray() {
        assertEquals(21, SumArray.arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
        assertEquals(-21, SumArray.arrayPlusArray(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
        assertEquals(15, SumArray.arrayPlusArray(new int[]{0,0}, new int[]{4,5,6}));
    }
}