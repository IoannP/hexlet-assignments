package exercise;

// BEGIN
interface Home {
  Double getArea();
  default int compareTo(Home home1, Home home2) {
    if (home1.getArea() > home2.getArea()) {
      return 1;
    } else if (home1.getArea() < home2.getArea()) {
      return -1;
    } else {
      return 0;
    }
  }
}
// END
