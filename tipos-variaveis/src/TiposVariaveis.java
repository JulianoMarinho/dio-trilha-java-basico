public class TiposVariaveis{
    public static void main(String[] args) {
        String nomeUm = "Gato";
        String nomeDois = new String ("Gato");
        double salarioMinimo = 2;
        int a, b;
        a = 6;
        b = 6;

        String resultado = a==b? "verdadeiro" : "falso";
        System.out.println(resultado);

        System.out.println("Sobre o comparativo de nome:");
        System.out.println(nomeUm == nomeDois);//comparando string com objeto
        System.out.println(nomeUm.equals(nomeDois));//equals compara conteudo
        /*Para objetos é recomendando usar o equals */

        /*Operadores logicos:
        && = e
        || = ou 
        */
    }
}