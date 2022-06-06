package loop;

import java.util.Scanner;

public class Ex1 {

    /*
     * Faça um programa que leia cojuntos de dois valores,
     * o primeiro representando o nome do aluno e o segundo representando a sua
     * idade.
     * Pare o programa inserindo o valor ZERO no campo nome
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int age;

        while (true) {
            System.out.println("Name: ");
            name = scan.next();
            if (name.equals("0"))
                break;
            System.out.println("Age: ");
            age = scan.nextInt();
        }

    }
}
