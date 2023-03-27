import java.util.Random;

/*
 * Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100)
 * armazene-os num vetor. Ao final mostre os números e seus sucessores
 */

public class Array3 {
    public static void main(String[] args) {
        
        Random numerosAleatorios = new Random();

        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            int numero = numerosAleatorios.nextInt(100);
            numeros[i] = numero;
        }

        System.out.println("Números Aleatórios: ");
        for (int i : numeros) {
            System.out.print(i + " ");
        }
        System.out.println("\nNúmeros Sucessores do Aleatórios: ");
        for (int i : numeros) {
            System.out.print((i+1) + " ");
        }
    }
}
