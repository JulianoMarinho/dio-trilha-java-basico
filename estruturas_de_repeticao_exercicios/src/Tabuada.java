import java.util.Scanner;

/*
 * Desenvolva um gerador de tabuada, 
 * capaz de gerar a tabuada de qualquer numero inteiro
 * de 1 à 10, o usuário deve informar qual numero ele
 * deseja ver a tabuada. 
 * A saida deve ser conforme o exemplo abaixo:
 * 
 * Tabuada de 5:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ...
 * 5 x 10 = 50
*/

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero inteiro de 1 a 10: ");
        int inteiro = scan.nextInt();
                
        for (int i = 1; i <= 10; i++) {
            System.out.println(inteiro + " x " + i +" = "+ (inteiro*i));
        }


    }
}
