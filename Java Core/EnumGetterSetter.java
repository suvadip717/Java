enum Laptops {
  Macbook(2000), XP5(1500), Surface(), Vivobook(1200);

  private int price;

  private Laptops() {
    price = 500;
  }

  private Laptops(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}

public class EnumGetterSetter {
  public static void main(String args[]) {

    for (Laptops lap : Laptops.values()) {
      System.out.println(lap + " : " + lap.getPrice());
    }
  }
}
