package qa_for_everyone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Таск1 Map
        Необходимо создать класс с тремя методами:
        принимает текст и ничего не возвращает
        возвращает список (Map) в котором в качестве ключа - слова из переданного текста,
        а в качестве значений - количество раз, когда этого слово встречается в тексте
        в качестве параметра принимается слово, а возвращаются все предложения (List)
        в которых используется это слово в тексте
        P.S. Поиск в третьем методе необходимо выполнять за O(1)*/


class RandomPhrasesMap_1 {

    private String text;

    void setText(String phrase) {
        text = phrase;
    }

    Map<String, Integer> countDuplicates() {
        Map<String, Integer> randomTextMap = new HashMap<>();
        String[] splitTextArray;
        splitTextArray = text.split(" ");
        for (int i = 0; i < splitTextArray.length; i++) {
            if (!randomTextMap.containsKey(splitTextArray[i])) {
                randomTextMap.put(splitTextArray[i], 1);
            } else {
                Integer value = randomTextMap.get(splitTextArray[i]);
                value = value + 1;
                randomTextMap.put(splitTextArray[i], value);
            }
        }
        return randomTextMap;
    }

    List<String> findSentencesByWord(String words) {
        List<String> sentences = new ArrayList<>();
        String[] splitTextArray;
        splitTextArray = text.split("[\\.\\!\\?]");
        for (int i = 0; i < splitTextArray.length; i++) {
            if (splitTextArray[i].contains(words)) {
                sentences.add(splitTextArray[i].trim());
            }
        }
        return sentences;
    }
}
