package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere( List<Map<String, String>> books, Map<String, String> dictionary) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> book:  books) {
            Boolean isIncluded = true;

            for (Entry<String, String> entry : dictionary.entrySet()) {
                String key = entry.getKey();
                String bookValue = book.get(key);
                String dictValue = entry.getValue();

                if (!dictValue.equals(bookValue)) {
                    isIncluded = false;
                    break;
                }
            }
            if (isIncluded) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
