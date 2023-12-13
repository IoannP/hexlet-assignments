package exercise;

// BEGIN
public class Flat implements Home {
  private Double area;
  private Double balconyArea;
  private int floor;

  public Flat(Number area, Number balconyArea, int floor) {
    this.area = area.doubleValue();
    this.balconyArea = balconyArea.doubleValue();
    this.floor = floor;
  }

  public int getFloor() {
    return floor;
  }

  public Double getBalconyArea() {
    return balconyArea;
  }

  @Override
  public Double getArea() {
    return this.area + this.balconyArea;
  }

  @Override
  public String toString() {
    return "Квартира площадью " 
      + getArea()
      + " метров на "
      + getFloor()
      + " этаже";
  }
}
// END
