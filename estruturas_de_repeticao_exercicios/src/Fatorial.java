import java.util.Scanner;

/*
 * Faça um programa que calcule o fatorial de um numero inteiro
 * fornecido pelo usuario
 * Ex.: 5! = 120
 */

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um inteiro: ");
        int inteiro = scan.nextInt();
        int multiplicacao = 1;

        for (int i = inteiro; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println(inteiro +"! = "+ multiplicacao);
    }
}
