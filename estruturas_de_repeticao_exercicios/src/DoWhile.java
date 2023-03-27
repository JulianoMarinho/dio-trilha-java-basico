import java.util.Scanner;

/*
 * Faça um programa que leia 5 numeros
 * informe o maior numero
 * e a media desses numeros
*/

public class DoWhile {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int qntidade = 0;
        int maior = 0;
        int numero;
        float media = 0;

        do {
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();
            if (numero > maior) maior = numero;             
            media = media + numero;
            qntidade++;
        } while (qntidade < 5);
        
        System.out.println("O maior numero digitado foi: "+maior);
        System.out.println("A média do números digitados é: " +(media/5));
    }
}
