package ListsExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class ListsOrder {
  /*
   * Dadas as informações, crie uma lista e ordene-a exibindo:
   * Gato 1 = nome: Jon, idade: 18, cor: preto
   * Gato 2 = nome: Simba, idade: 6, cor: tigrado
   * Gato 3 = nome: Jon, idade: 12, cor: amarelo
   */
  public static void main(String[] args) {
    List<Cat> myCats = new ArrayList<>() {
      {
        add(new Cat("Jon", 18, "preto"));
        add(new Cat("Simba", 6, "tigrado"));
        add(new Cat("Jon", 18, "amarelo"));
      }
    };

    System.out.println("--\tOrdem de Inserção\t--");
    System.out.println(myCats);

    System.out.println("--\tOrdem Aleatória\t--");
    Collections.shuffle(myCats);
    System.out.println(myCats);

    System.out.println("--\tOrdem Natural (Nome)\t--");
    Collections.sort(myCats);
    System.out.println(myCats);

    System.out.println("--\tOrdem Idade\t--");
    Collections.sort(myCats, new ComparatorAge());
    System.out.println(myCats);

    System.out.println("--\tOrdem Cor\t--");
    Collections.sort(myCats, new ComparatorColor());
    System.out.println(myCats);

    System.out.println("--\tOrdem Nome/Cor/Idade\t--");
    Collections.sort(myCats, new ComparatorNameAgeColor());
    System.out.println(myCats);

  }
}

class Cat implements Comparable<Cat> {
  private String name;
  private Integer age;
  private String color;

  public Cat(String name, Integer age, String color) {
    this.name = name;
    this.age = age;
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

  public String getColor() {
    return color;
  }

  @Override
  public String toString() {
    return "{" +
        "name=" + name +
        ", age=" + age +
        ", color=" + color +
        "}";
  }

  @Override
  public int compareTo(Cat cat) {
    return this.getName().compareToIgnoreCase(cat.getName());
  }

}

class ComparatorAge implements Comparator<Cat> {
  @Override
  public int compare(Cat g1, Cat g2) {
    return Integer.compare(g1.getAge(), g2.getAge());
  }
};

class ComparatorColor implements Comparator<Cat> {
  @Override
  public int compare(Cat g1, Cat g2) {
    return g1.getColor().compareToIgnoreCase(g2.getColor());
  }
}

class ComparatorNameAgeColor implements Comparator<Cat> {
  @Override
  public int compare(Cat g1, Cat g2) {
    int name = g1.getName().compareToIgnoreCase(g2.getName());
    if (name != 0)
      return name;

    int color = g1.getColor().compareToIgnoreCase(g2.getColor());
    if (color != 0)
      return color;

    return Integer.compare(g1.getAge(), g2.getAge());
  }
}