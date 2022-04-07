package codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YesOrNoTest {

    @Test
    public void boolToWord() {
        assertEquals(YesOrNo.boolToWord(true),"Yes");
        assertEquals(YesOrNo.boolToWord(false),"No");
    }
}