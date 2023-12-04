package exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
import java.util.stream.Collectors;
class App {
    public static String getForwardedVariables(String config) {
        String result = Arrays.asList(config.split("\n"))
            .stream()
            .filter(line -> line.startsWith("environment"))
            .map(line -> line.replace("environment=", ""))
            .flatMap(line -> Arrays.asList(line.split(",")).stream())
            .map(line -> line.replace("\"", ""))
            .filter(line -> line.startsWith("X_FORWARDED_"))
            .map(line -> line.replace("X_FORWARDED_", ""))
            .collect(Collectors.joining(","));

        return result;
    }

    
}
//END
