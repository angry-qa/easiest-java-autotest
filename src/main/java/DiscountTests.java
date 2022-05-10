package main.java;

public class DiscountTests {

  DiscountService service = new DiscountService();

  public void checkSum(int sum, int expected) {
    int actual = service.discountCalc(sum);

    if (expected == actual) {
      System.out.println("Test Passed! Sum is: " + sum + ", Discount: " + actual);
    } else {
      System.out.println("Test Failed! Sum is: " + sum + ", Expected: " + expected + ", but Actual: " + actual);
    }
  }

}
