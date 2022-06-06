package array;

import java.util.Scanner;

/* Faça um programa que leia um vetor de 6 caracteres e diga quantas consoantes foram lidas. Imprima as consoantes. */

public class Ex2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String[] consonants = new String[6];
    int quantityConsonants = 0;

    int count = 0;

    do {
      System.out.println("Letter: ");
      String letter = scan.next();

      if (!(letter.equalsIgnoreCase("a") |
          letter.equalsIgnoreCase("e") |
          letter.equalsIgnoreCase("i") |
          letter.equalsIgnoreCase("o") |
          letter.equalsIgnoreCase("u"))) {
        consonants[count] = letter;
        quantityConsonants++;
      }

      count++;
    } while (count < consonants.length);

    System.out.println("Consonants: ");
    for (String consonant : consonants) {
      if (consonant != null)
        System.out.println(consonant);
    }

    System.out.println("Quantity of consonants: " + quantityConsonants);

  }
}
