/*
 * Crie um vetor de 6 números inteiros
 * e mostre-os na ordem inversa.
 */

public class Array1 {
    public static void main(String[] args) {
        
        int [] vetor = {-5, -6, 15, 50, 8, 4};//assim que é declarado um vetor em java
        int i = vetor.length - 1;
        
        //System.out.println(vetor);//mostra a posição de memoria do array

        while(i >= 0){
            System.out.print(vetor[i] + " ");
            i--;
        }
    }
}
