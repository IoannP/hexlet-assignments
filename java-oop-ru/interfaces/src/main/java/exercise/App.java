package exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

// BEGIN
public class App {
  public static List<String> buildApartmentsList(List<Home> builds, int buildsCount) {
    return builds.stream()
      .sorted(Comparator.comparing(Home::getArea))
      .map(build -> build.toString())
      .limit(buildsCount)
      .collect(Collectors.toList());
  }
};
// END
