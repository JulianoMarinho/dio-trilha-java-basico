import java.util.Scanner;

/*
 * 8 - Faça um programa que leia 5 números e informe a soma e a média dos números.
 */

public class SomaMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[5];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = scan.nextInt(); 
        }
        //imprimir o maior numero
        int max = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(max < numeros[i]) max = numeros[i];
        }
        System.out.println("O maior valor é: "+max);
        
        
        //foreach
        int soma = 0;
        System.out.println("\nNumeros digitados:");
        System.out.print("Numeros: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
            soma += numero;
        }

        System.out.println("\nSoma dos numeros: " +soma);
        System.out.println("\nMédia dos numeros: "+soma/(numeros.length -1));
    
    }
}
