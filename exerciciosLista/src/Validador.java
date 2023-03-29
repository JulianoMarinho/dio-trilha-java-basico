import java.util.Scanner;

/*
 * Faça um programa que leia e valide as seguintes informações:
   Nome: maior que 3 caracteres;
   Idade: entre 0 e 150;
   Salário: maior que zero;
   Sexo: 'f' ou 'm';
   Estado Civil: 's', 'c', 'v', 'd';
 */

public class Validador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message;

        //NOME====================
        System.out.println("Digite um nome com mais de 3 caracteres: ");
        String nome = scan.next();
        message = nome.length() >= 3?
                    "O nome possui mais que 3 caracteres"
                    :"O nome possui menos que 3 caracteres";
        System.out.println(message);

        //IDADE===================
        System.out.println("Digite uma idade entre 0 a 150 anos: ");
        int idade = scan.nextInt();
        message = idade >= 0 && idade <= 150?
                    "A idade esta entre 0 e 150"
                    :"A idade está fora do intervalo";
        System.out.println(message);

        //SALARIO=================
        System.out.println("Digite um salario maior que zero: ");
        int salario = scan.nextInt();
        message = salario > 0?
                         "Salario maior que zero"
                         :"Salario menor que zero";
        System.out.println(message);

        //SEXO===================
        System.out.println("Digite o sexo m ou f: ");
        String sexo = scan.next();
        message = sexo.equals("m") | sexo.equals("f")?
                    "Sexo é igual a m ou f"
                    :"Sexo é diferente de m ou f";
        System.out.println(message);
        
        System.out.println("Digite o estado civil, s, c, v ou d: ");
        String eCivil = scan.next();
        message = eCivil.equals("s") | eCivil.equals("c") 
                | eCivil.equals("v") | eCivil.equals("d")?
                "Estado civil é igual s,c,v ou d"
                :"Sexo é diferente de s,c,v ou d";
        System.out.println(message);
    }
}
