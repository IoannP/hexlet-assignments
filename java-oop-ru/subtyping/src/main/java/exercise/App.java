package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage dictionary) {
        Map<String, String> copy = new HashMap<>(dictionary.toMap());

        for (Entry<String, String> entry : copy.entrySet()) {
            var value = entry.getValue();
            var key = entry.getKey();

            dictionary.unset(key);
            dictionary.set(value, key);
        }
    }
}
// END
