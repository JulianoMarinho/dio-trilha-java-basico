/*
 * Supondo que a população de um país A seja da ordem de 80000 habitantes com uma 
 * taxa anual de crescimento de 3% e que a população de B seja 200000 
 * habitantes com uma taxa de crescimento de 1.5%. 
 * Faça um programa que calcule e escreva o número de anos 
 * necessários para que a população do país A ultrapasse ou iguale a 
 * população do país B, mantidas as taxas de crescimento.
 */

public class Populacao {
    public static void main(String[] args) {
        double popA = 80000; //3%
        double popB = 200000; //1.5%

        double taxaA = 0.03;
        double taxaB = 0.015;

        int i = 0;

        do{
            popA += popA + (popA*taxaA);
            popB += popB + (popB*taxaB);
            i++;
            
        }while(popA <= popB);

        System.out.println("A população A se igualou ou ultrapassou a população b em "+i+" anos" );
        
    }
}
