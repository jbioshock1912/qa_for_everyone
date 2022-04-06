package qa_for_everyone;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RandomPhrasesMap_1Test {

    private RandomPhrasesMap_1 testObject;

    @Before
    public void fillData() {
        testObject = new RandomPhrasesMap_1();
        testObject.setText("привет привет тест тест тест мама папа");
    }

    @Test
    public void countDuplicatesTest1() {
        Map<String, Integer> randomTextMap = new HashMap<>();
        randomTextMap.put("привет", 2);
        randomTextMap.put("тест", 3);
        randomTextMap.put("мама", 1);
        randomTextMap.put("папа", 1);
        Assert.assertEquals(randomTextMap, testObject.countDuplicates());
    }

    @Test
    public void findSentencesByWordTest1() {
        testObject.setText("мир привет. я пошла гулять! мама ты где? мир мой.");
        List<String> sentences = List.of("мир привет", "мир мой");
        Assert.assertEquals(sentences, testObject.findSentencesByWord("мир"));
    }
}