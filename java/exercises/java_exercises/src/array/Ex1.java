package array;

/* Crie um vetor de 6 números inteiros e mostre-os na ordem inversa */

public class Ex1 {
  public static void main(String[] args) {

    int[] vetor = { 10, 12, 55, 28, 18 };
    int count = 0;

    System.out.println("Vetor: ");
    while (count < (vetor.length)) {
      System.out.println(vetor[count] + " ");
      count++;
    }

    System.out.println("\nVetor reverso: ");

    for (int i = (vetor.length - 1); i >= 0; i--) {
      System.out.println(vetor[i] + " ");
    }

  }
}
