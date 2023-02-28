package application;

import java.util.Scanner;

public class QuintaQuestao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase para ser invertida:");
        String teste = sc.nextLine();

        System.out.println(inverterString(teste));
    }

    private static String inverterString(String texto) {
        StringBuilder sb = new StringBuilder();

        for (int i = texto.length() - 1; i >= 0; i--) {
            sb.append(texto.charAt(i));
        }
        return sb.toString();
    }
}
