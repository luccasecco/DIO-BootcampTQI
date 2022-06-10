package Exercises;

public class Car {
  String brand;
  String color;
  Integer fuelTankCapacity;

  public Car() {

  }

  public Car(String brand, String color, Integer fuelTankCapacity) {
    this.brand = brand;
    this.color = color;
    this.fuelTankCapacity = fuelTankCapacity;
  }

  public String getColor() {
    return this.color;
  }

  public String getBrand() {
    return this.brand;
  }

  public Integer getFuelTankCapacity() {
    return this.fuelTankCapacity;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setFuelTankCapacity(int fuelTankCapacity) {
    this.fuelTankCapacity = fuelTankCapacity;
  }

  double totalFuelTank(double fuelPrice) {
    return fuelTankCapacity * fuelPrice;
  }

}
