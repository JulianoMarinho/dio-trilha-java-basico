import java.util.Scanner;

/*
 * Faça um programa que leia um vetor de 6 caracteres
 * e diga quantas consoantes foram lidas.
 * Imprima as consoantes.
 */

public class Array2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;
        int i = 0;
        do{
            System.out.println("Letra: ");
            String letra = scan.next();

            if( !(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u"))){
                    consoantes[i] = letra;
                    quantidadeConsoantes++;
                }

            i++;

        }while(i < consoantes.length);

        for (String consoante : consoantes) {
            if(consoante != null) System.out.print(consoante + " "); //para cada elemento dentro deste array de consoantes imprima a consoante
            
        }//foreach
        System.out.println("");
        System.out.println("Qntidade de consoantes "+quantidadeConsoantes);

    }
}
