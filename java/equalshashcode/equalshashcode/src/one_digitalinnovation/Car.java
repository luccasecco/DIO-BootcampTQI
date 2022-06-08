package one_digitalinnovation;

import java.util.Objects;

public class Car implements Comparable<Car> {
  String brand;

  public Car(String brand) {
    this.brand = brand;
  }

  public String getBrand() {
    return this.brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Car car = (Car) o;
    return Objects.equals(brand, car.brand);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(brand);
  }

  @Override
  public String toString() {
    return "{" +
        " brand='" + getBrand() + "'" +
        "}";
  }

  // ordem tamanho
  // @Override
  // public int compareTo(Car o) {
  // if (this.brand.length() < o.brand.length()) {
  // return -1;
  // } else if (this.brand.length() > o.brand.length()) {
  // return 1;
  // }
  // return 0;
  // }

  // ordem alfabética
  @Override
  public int compareTo(Car o) {
    return this.getBrand().compareTo(o.getBrand());
  }

}
