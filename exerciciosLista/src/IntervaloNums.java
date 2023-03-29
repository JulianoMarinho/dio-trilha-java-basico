/*
 * Faça um programa que receba dois números inteiros e gere os números inteiros 
 * que estão no intervalo compreendido por eles.
 */

import java.util.Scanner;

public class IntervaloNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("Digite o primeiro numero: ");
        num1 = scan.nextInt();
        System.out.println("Digite o Segundo Numero: ");
        num2 = scan.nextInt();

        for (int i = (num1+1); i < num2; i++) {
            System.out.print(i + " ");
        }
    }
}
