package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map getWordCount(String sentence) {
        Map<String, Integer> wordsMap = new HashMap<>();
        if (sentence.length() == 0) {
            return wordsMap;
        }

        String[] words = sentence.toLowerCase().split(" ");

        for (String word: words) {
            if (wordsMap.containsKey(word))  {
                Integer wordCount = wordsMap.get(word);
                wordsMap.replace(word, wordCount + 1);
            } else {
                wordsMap.put(word, 1);
            }
        }

        return wordsMap;
    }

    public static String toString(Map map) {
        String result = "";
        for (Object key: map.keySet()) {
            result += String.format("  %s: %o\n", key, map.get(key));
        }

        return result.length() == 0 ? "{}" : "{\n" + result + "}";
    }
}
//END
