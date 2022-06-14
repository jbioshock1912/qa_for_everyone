package codewars;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SequenceTest {

    @Test
    public void reverse() {
        assertArrayEquals(new int[]{5,4,3,2,1},Sequence.reverse(5));
    }
}