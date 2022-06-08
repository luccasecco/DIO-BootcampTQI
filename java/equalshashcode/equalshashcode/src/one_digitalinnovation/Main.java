package one_digitalinnovation;

import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {

  public static void main(String[] args) {

    // AULA 1 - Conceitos de equals e hashCode
    // List<Car> listOfCars = new ArrayList<>();
    // listOfCars.add(new Car("Ford"));
    // listOfCars.add(new Car("Chevrolet"));
    // listOfCars.add(new Car("Renault"));

    // System.out.println(listOfCars.contains(new Car("Ford")));
    // System.out.println(new Car("Ford").hashCode());

    // Car car1 = new Car("Ford");
    // Car car2 = new Car("Renault");
    // Car car3 = new Car("Chevrolet");
    // System.out.println(car1.equals(car2));
    // System.out.println(car2.equals(car3));
    // System.out.println(car3.equals(car3));

    // AULA 02 - Stack
    // Stack<Car> carStack = new Stack<>();
    // carStack.push(new Car("Ford"));
    // carStack.push(new Car("Chevrolet"));
    // carStack.push(new Car("Fiat"));

    // System.out.println(carStack);
    // System.out.println(carStack.pop());
    // System.out.println(carStack);

    // System.out.println(carStack.peek());
    // System.out.println(carStack);

    // System.out.println(carStack.empty());
    // System.out.println(carStack);
    // }

    // AULA 03 - Queue

    // Queue<Car> queueCars = new LinkedList<>();

    // queueCars.add(new Car("Ford"));
    // queueCars.add(new Car("Chevrolet"));
    // queueCars.add(new Car("Renault"));

    // System.out.println(queueCars.add(new Car("Fiat")));
    // System.out.println(queueCars);

    // System.out.println(queueCars.offer(new Car("Peugeot")));
    // System.out.println(queueCars);

    // System.out.println(queueCars.peek());
    // System.out.println(queueCars);

    // System.out.println(queueCars.poll());
    // System.out.println(queueCars);

    // System.out.println(queueCars.isEmpty());

    // System.out.println(queueCars.size());

    // AULA 04 - List

    // List<Car> listCars = new ArrayList<>();

    // listCars.add(new Car("Ford"));
    // listCars.add(new Car("Chevrolet"));
    // listCars.add(new Car("Fiat"));
    // listCars.add(new Car("Renault"));

    // System.out.println(listCars.contains(new Car("Ford")));

    // System.out.println(listCars.get(2));

    // System.out.println(listCars.indexOf(new Car("Fiat")));

    // System.out.println(listCars.remove(2));
    // System.out.println(listCars);

    // AULA 05 - Set

    Set<Car> hashSetCars = new HashSet<>();

    hashSetCars.add(new Car("Ford"));
    hashSetCars.add(new Car("Chevrolet"));
    hashSetCars.add(new Car("Fiat"));
    hashSetCars.add(new Car("Peugeot"));
    hashSetCars.add(new Car("Zip"));
    hashSetCars.add(new Car("Alfa Romeo"));

    System.out.println(hashSetCars);

    Set<Car> treeSetCars = new TreeSet<>();

    treeSetCars.add(new Car("Ford"));
    treeSetCars.add(new Car("Chevrolet"));
    treeSetCars.add(new Car("Fiat"));
    treeSetCars.add(new Car("Peugeot"));
    treeSetCars.add(new Car("Zip"));
    treeSetCars.add(new Car("Alfa Romeo"));

    System.out.println(treeSetCars);
  }
}
