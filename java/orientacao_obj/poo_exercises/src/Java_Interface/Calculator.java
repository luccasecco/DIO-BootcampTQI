package Java_Interface;

public class Calculator implements Operations {

  @Override
  public void addition(double number1, double number2) {
    System.out.println("Result: " + (number1 + number2));
  }

  @Override
  public void subtraction(double number1, double number2) {
    System.out.println("Result: " + (number1 - number2));
  }

  @Override
  public void multiplication(double number1, double number2) {
    System.out.println("Result: " + (number1 * number2));
  }

  @Override
  public void division(double number1, double number2) {
    System.out.println("Result: " + (number1 / number2));
  }

}
