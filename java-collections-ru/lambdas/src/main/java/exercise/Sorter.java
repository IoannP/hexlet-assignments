package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
public class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        Comparator<Map<String, String>> comparator = (user1, user2) -> {
            LocalDate date1 = LocalDate.parse(user1.get("birthday"));
            LocalDate date2 = LocalDate.parse(user2.get("birthday"));
            return date1.compareTo(date2);
        };
        return users
            .stream()
            .filter((user) -> user.get("gender") == "male")
            .sorted(comparator)
            .map((user) -> user.get("name"))
            .collect(Collectors.toList());
    }
}
// END
