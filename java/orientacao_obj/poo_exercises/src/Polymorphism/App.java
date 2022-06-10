package Polymorphism;

public class App {

  public static void main(String[] args) {

    MotherClass[] classes = new MotherClass[] { new ChildrenClass1(), new ChildrenClass2(), new MotherClass() };

    for (MotherClass classe : classes) {
      classe.method1();
    }

    System.out.println("");

    for (MotherClass classe : classes) {
      classe.method2();
    }

    System.out.println("");

    // Subscribe
    ChildrenClass2 childrenClass2 = new ChildrenClass2();
    childrenClass2.method2();

  }
}
