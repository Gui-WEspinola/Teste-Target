package application;

import java.util.Scanner;

public class SegundaQuestao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (verificaFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci");
        }
    }

    public static boolean verificaFibonacci(int numero) {
        int fib1 = 0;
        int fib2 = 1;
        int fib3 = 1;
        while (fib3 < numero) {
            fib1 = fib2;
            fib2 = fib3;
            fib3 = fib1 + fib2;
        }
        if (fib3 == numero) {
            return true;
        } else {
            return false;
        }
    }
}
