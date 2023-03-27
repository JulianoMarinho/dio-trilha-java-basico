import java.util.Scanner;

/*
 * Faça um programa que peça N numeros inteiros,
 * calcule e mostre a quantidade de numeros pares
 * e a quantidade de numeros impares.
*/

public class ParImpar {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        
        int numero;
        int qntidadePares = 0;
        int qntidadeImpares = 0;
        int count = 0;

        System.out.println("Quantos numeros voce vai digitar? ");
        int qntidadeNumeros = scan.nextInt();

       do{
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();
            if (numero % 2 == 0){
                qntidadePares++;
            }else {
                qntidadeImpares++;
            }
            count ++;

       }while (count < qntidadeNumeros);

       System.out.println("Quantidade de numeros pares digitados: "+qntidadePares);
       System.out.println("Quantidade de numeros impares digitados: "+qntidadeImpares);
    }
}
