package codewars;

import org.junit.Assert;
import org.junit.Test;

public class PositionTest {

    @Test
    public void position() {
        char b = 'b';
        char z = 'z';
        Assert.assertEquals("Position of alphabet: 2", Position.position(b));
        Assert.assertEquals("Position of alphabet: 26", Position.position(z));
    }
}