package codewars;

import org.junit.Assert;
import org.junit.Test;

public class TripleTroubleTest {

    @Test
    public void tripleTrouble_1() {
        String one = "aa";
        String two = "bb";
        String three = "cc";
        String result = "abcabc";
        Assert.assertEquals(result, TripleTrouble.tripleTrouble(one, two, three));
    }

    @Test
    public void tripleTrouble_2() {
        String one = "this";
        String two = "test";
        String three = "lock";
        String result = "ttlheoiscstk";
        Assert.assertEquals(result, TripleTrouble.tripleTrouble(one, two, three));
    }
}