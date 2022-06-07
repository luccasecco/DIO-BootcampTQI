package ListsExercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class Exercise1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List<Double> temperatures = new ArrayList<Double>();

    int count = 0;
    while (true) {
      if (count == 6)
        break;

      System.out.print("Digite uma temperatura: ");
      double temp = scan.nextDouble();
      temperatures.add(temp);
      count++;
    }

    System.out.print("As temperaturas são: ");
    temperatures.forEach(temp -> System.out.print(temp + " "));

    double averageTemperature = temperatures.stream()
        .mapToDouble(Double::doubleValue)
        .average()
        .orElse(0d);
    System.out.printf("\nMédia das temperaturas: %.1f\n", averageTemperature);

    // exibindo as temperaturas acima da média
    System.out.print("Temperaturas acima da média: ");
    temperatures.stream()
        .filter(t -> t > averageTemperature)
        .forEach(t -> System.out.printf("%.1f ", t));

    // exibindo o mês das temperaturas acima da média por extenso:
    System.out.println("\n\nMeses com temperaturas acima da média: ");
    Iterator<Double> iterator = temperatures.iterator();

    count = 0;
    while (iterator.hasNext()) {
      Double temp = iterator.next();
      if (temp > averageTemperature) {
        switch (count) {
          case (0):
            System.out.printf("1 - January: %.1f\n ", temp);
            break;
          case (1):
            System.out.printf("2 - February: %.1f\n", temp);
            break;
          case (2):
            System.out.printf("3 - March: %.1f\n", temp);
            break;
          case (3):
            System.out.printf("4 - April: %.1f\n", temp);
            break;
          case (4):
            System.out.printf("5 - May: %.1f\n", temp);
            break;
          case (5):
            System.out.printf("6 - Jun: %.1f\n", temp);
            break;
          default:
            System.out.println("Sem temperaturas acima da média");
        }
      }
      count++;
    }
  }
}
