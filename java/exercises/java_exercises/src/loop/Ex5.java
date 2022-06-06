package loop;

import java.util.Scanner;

/* Desenvolva um gerador de tabuada capaz de gerar a tabuada de qualquer número inteiro
 * entre 1 a 10. O usuário deve informar o número de entrada. A saíde deve ser:
 * Tabuada de 5:
 * 5x1 = 5
 * 5x2 = 10
 * ...
 * 5x10 = 50
 */

public class Ex5 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Número: ");
    int number = scan.nextInt();

    System.out.println("Tabuada de: " + number);

    for (int i = 1; i <= 10; i++) {
      System.out.println(number + " X " + i + " = " + (number * i));
    }

  }
}
