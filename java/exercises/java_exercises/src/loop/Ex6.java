package loop;

import java.util.Scanner;

import javax.rmi.ssl.SslRMIClientSocketFactory;

/* Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário */

public class Ex6 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int number;
    int multiplication = 1;

    System.out.println("Digite um número: ");

    number = scan.nextInt();
    System.out.println("Fatorial de: " + number);
    System.out.println(number + "! = ");

    for (int i = number; i >= 1; i--) {
      multiplication = multiplication * i;
    }

    System.out.println(multiplication);

  }
}
