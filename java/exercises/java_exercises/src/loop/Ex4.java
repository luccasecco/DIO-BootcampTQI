package loop;

import java.util.Scanner;

/* Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares
 * e a quantidade de números ímpares.
 */

public class Ex4 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int quantity;
    int count = 0;
    int number;
    int quantityEven = 0;
    int quantityOdd = 0;

    System.out.println("Digite a quantidade de números: ");
    quantity = scan.nextInt();

    do {
      System.out.println("Número: ");
      number = scan.nextInt();

      if (number % 2 == 0)
        quantityEven++;
      else
        quantityOdd++;

      count++;
    } while (count < quantity);

    System.out.println("Quantidade Par: " + quantityEven);
    System.out.println("Quantidade Ímpar: " + quantityOdd);

  }
}
