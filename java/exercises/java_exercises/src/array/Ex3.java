package array;

import java.util.Random;

/* Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) e armazene-os num vetor. 
 * Ao final mostre os números e seus sucessores.
 */

public class Ex3 {
  public static void main(String[] args) {

    Random random = new Random();

    int[] randomNumbers = new int[20];

    for (int i = 0; i < randomNumbers.length; i++) {
      int number = random.nextInt(100);
      randomNumbers[i] = number;
    }

    System.out.print("\nRandom numbers: ");
    for (int number : randomNumbers) {
      System.out.print(number + " ");
    }

    System.out.print("\nSuccessor number: ");
    for (int number : randomNumbers) {
      System.out.print((number + 1) + " ");
    }

  }
}
