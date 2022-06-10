package Exercises;

public class CarPlay {

  public static void main(String[] args) {

    Car car1 = new Car();

    car1.setColor("White");
    car1.setBrand("Renault");
    car1.setFuelTankCapacity(55);

    System.out.println(car1.getBrand());
    System.out.println(car1.getColor());
    System.out.println(car1.getFuelTankCapacity());
    System.out.println(car1.totalFuelTank(7.35));

    Car car2 = new Car("Ford", "Blue", 60);

    System.out.println(car2.getBrand());
    System.out.println(car2.getColor());
    System.out.println(car2.getFuelTankCapacity());
    System.out.println(car2.totalFuelTank(7.35));

  }
}
