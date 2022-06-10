package UpCast_DownCast;

public class App {

  public static void main(String[] args) {

    Employee employee = new Employee();

    // Upcast
    Employee manager = new Manager();
    Employee seller = new Seller();
    Employee janitor = new Janitor();

    // Downcast
    Seller seller_ = (Seller) new Employee();

  }
}
