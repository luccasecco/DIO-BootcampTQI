package loop;

import java.util.Scanner;

/* Faça um programa que leia 5 números.
 Informe o maior número e a média desses números.
 */

public class Ex3 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int number;
    int bigger = 0;
    int sum = 0;
    int count = 0;

    do {
      System.out.println("Number: ");
      number = scan.nextInt();

      sum = sum + number;

      if (number > bigger)
        bigger = number;

      count = count + 1;
    } while (count < 5);

    System.out.println("bigger: " + bigger);
    System.out.println("average : " + (sum / 5));
  }
}
