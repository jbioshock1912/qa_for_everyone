package codewars;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class StringArrayTest {

    @Test
    public void stringToArray() {
        assertArrayEquals(new String[]{"Robin", "Singh"}, StringArray.stringToArray("Robin Singh"));
        assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"},
                StringArray.stringToArray("I love arrays they are my favorite"));
    }
}