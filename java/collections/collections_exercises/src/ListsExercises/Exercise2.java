package ListsExercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ela será classificado como "Inocente".
*/
public class Exercise2 {
  public static void main(String[] args) {
    List<String> answers = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    System.out.println("Perguntas: ");
    System.out.print("\nTelefonou para vítima? ");
    String answer = scan.next();
    answers.add(answer.toLowerCase());
    System.out.print("Esteve no local do crime? ");
    answer = scan.next();
    answers.add(answer.toLowerCase());
    System.out.print("Mora perto da vítima? ");
    answer = scan.next();
    answers.add(answer.toLowerCase());
    System.out.print("Devia para vítima? ");
    answer = scan.next();
    answers.add(answer.toLowerCase());
    System.out.print("Já trabalhou com a vítima? ");
    answer = scan.next();
    answers.add(answer.toLowerCase());

    System.out.println(answers);

    int count = 0;
    Iterator<String> counter = answers.iterator();
    while (counter.hasNext()) {
      String resp = counter.next();
      if (resp.contains("s")) {
        count++;
      }
    }

    switch (count) {
      case 2:
        System.out.println("--- SUSPECT ---");
        break;
      case 3:
      case 4:
        System.out.println("--- ACCOMPLICE ---");
        break;
      case 5:
        System.out.println("--- MURDER ---");
        break;
      default:
        System.out.println("--- INNOCENT ---");
        break;
    }
  }
}