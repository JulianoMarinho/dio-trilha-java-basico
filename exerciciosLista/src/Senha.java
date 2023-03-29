import java.util.Scanner;

/*
 * Faça um programa que leia um nome de usuário e a sua senha e não aceite a 
 * senha igual ao nome do usuário,mostrando uma mensagem de erro e voltando 
 * a pedir as informações.
 */

public class Senha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um nome de usuario: ");
        String nome = scan.next();
        System.out.println("Digite uma senha: ");
        String senha = scan.next();

        while(nome.equals(senha)){
        System.out.println("Nome e senhas iguais, Digite um nome de usuario: ");
        nome = scan.next();
        System.out.println("Digite uma senha diferente do nome de usuario: ");
        senha = scan.next(); 
        }
    }
}
