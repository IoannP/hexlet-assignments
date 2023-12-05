package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
public class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> dict1, Map<String, Object> dict2) {
        Set <String> keys = new TreeSet<>();
        LinkedHashMap <String, String> diff = new LinkedHashMap<>();

        keys.addAll(dict1.keySet());
        keys.addAll(dict2.keySet());

        for (String key : keys) {
            if (!dict1.containsKey​(key)) {
                diff.put(key, "added");
                continue;
            }
            if (!dict2.containsKey​(key)) {
                diff.put(key, "deleted");
                continue;
            }
            if (dict1.get(key).equals(dict2.get(key))) {
                diff.put(key, "unchanged");
            } else {
                diff.put(key, "changed");
            }
        }
        return diff;
    }
}
//END
