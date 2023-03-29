import java.util.ArrayList;

/*
 * Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50
 */

public class NumerosImpares {
    public static void main(String[] args) {
        
        //teste arraylist
        // instancia o objeto ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 50; i++) {
            if(i % 2 == 1) list.add(i);
        }

        //imprimindo os valores do array
        System.out.println(list.toString());
        
    }
}
