package exercise;

import java.util.List;

// BEGIN
class App {
    public static Long getCountOfFreeEmails(List<String> emails) {
        Long count = emails
            .stream()
            .filter(email -> email.matches(".*gmail.com$|.*yandex.ru$|.*hotmail.com$"))
            .count();

        return count;
    }
}
// END
