package SetExercises;

import java.util.*;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

public class Exercise1 {
  public static void main(String[] args) {
    System.out.println("Crie uma conjunto contendo as cores do arco-íris: ");
    Set<String> rainbowColors = new HashSet<>();
    rainbowColors.add("yellow");
    rainbowColors.add("orange");
    rainbowColors.add("indigo");
    rainbowColors.add("red");
    rainbowColors.add("violet");
    rainbowColors.add("blue");
    rainbowColors.add("green");
    System.out.println(rainbowColors);

    System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra: ");
    for (String cor : rainbowColors) {
      System.out.println(cor);
    }

    System.out.println("A quantidade de cores que o arco-íris tem: " + rainbowColors.size());

    System.out.println("Exiba as cores em ordem alfabética: ");
    Set<String> rainbowColors2 = new TreeSet<>(rainbowColors);
    System.out.println(rainbowColors2);

    System.out.println("Exiba as cores na ordem inversa da que foi informada ");
    Set<String> rainbowColors3 = new LinkedHashSet<>(
        Arrays.asList("indigo", "blue", "violet", "yellow", "red", "green", "orange"));
    System.out.println(rainbowColors3);
    List<String> rainbowColorsList = new ArrayList<>(rainbowColors3);
    Collections.reverse(rainbowColorsList);
    System.out.println(rainbowColorsList);

    System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
    for (String color : rainbowColors) {
      if (color.startsWith("v"))
        System.out.println(color);
    }

    System.out.println("Remova todas as cores que não começam com a letra “v”: ");
    Iterator<String> iterator2 = rainbowColors.iterator();
    while (iterator2.hasNext()) {
      if (!iterator2.next().startsWith("v"))
        iterator2.remove();
    }
    System.out.println(rainbowColors);

    System.out.println("Limpe o conjunto: ");
    rainbowColors.clear();

    System.out.println("Confira se o conjunto está vazio: " + rainbowColors.isEmpty());
  }
}