package exercise;

// BEGIN
public class Cottage implements Home {
  private Double area;
  private int floorCount;

  public Cottage(Number area, int floorCount) {
    this.area = area.doubleValue();
    this.floorCount = floorCount;
  }

  public int getFloorCount() {
    return floorCount;
  }

  @Override
  public Double getArea() {
    return area;
  }

  @Override
  public String toString() {
    return getFloorCount()
      + " этажный коттедж площадью "
      + getArea()
      + " метров";
  }
}
// END
