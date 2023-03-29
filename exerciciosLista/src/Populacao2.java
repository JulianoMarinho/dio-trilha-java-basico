import java.util.Scanner;

/*
 *5 - Altere o programa anterior permitindo ao usuário informar as populações e as 
 * taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.
 */
public class Populacao2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        double popA = 0;
        double popB = 0;
        double taxaA = 0;
        double taxaB = 0;
        int teste = 0;
        do{
           
        System.out.println("Dados sobre populações, devem ser maior que zero");
        System.out.println("Entre com um valor para a população A: ");
        popA = scan.nextDouble();
        
        System.out.println("Entre com um valor para a população B: ");
        popB = scan.nextDouble();
        
        System.out.println("Entre com a Taxa de crescimento da população A: ");
        taxaA = scan.nextDouble();
        
        System.out.println("Entre com a Taxa de crescimento da população B: ");
        taxaB = scan.nextDouble();
        teste = popA <=0? 1: popB <= 0? 1 : taxaA <=0? 1: taxaB <= 0? 1: 0 ;

        }while(teste == 1);

        int i = 0;

        do{
            popA += popA + (popA*taxaA);
            popB += popB + (popB*taxaB);
            i++;
            
        }while(popA <= popB);

        System.out.println("A população A se igualou ou ultrapassou a população b em "+i+" anos" );
    }
}
