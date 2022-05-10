package main.java;

public class Main {

  public static void main(String[] args) {
    DiscountTests discountTests = new DiscountTests();

    discountTests.checkSum(900, 0);
    discountTests.checkSum(1000, 50);
    discountTests.checkSum(2000, 100);
    discountTests.checkSum(15000, 1000);
  }

}
