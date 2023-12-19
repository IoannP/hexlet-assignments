package exercise;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {
    public static void save(Path path, Car car) {
        try {
            Files.writeString(path, car.serialize(), StandardOpenOption.WRITE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Car extract(Path path) {
        try {
            return Car.unserialize(Files.readString(path));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
// END
