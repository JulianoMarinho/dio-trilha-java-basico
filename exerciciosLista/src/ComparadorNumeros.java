import java.util.Scanner;

/*
 * Faça um programa que leia 5 números e informe o maior número.
 */
public class ComparadorNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int numero = 0;
        int teste = 0;
        do{
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            if(teste < numero) teste = numero;
            
            i++;

        }while (i < 5);

        System.out.println("O maior numero digitado foi: "+teste);
        
    }
}
