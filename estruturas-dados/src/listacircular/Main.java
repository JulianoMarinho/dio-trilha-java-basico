package listacircular;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> minhaListaCicurlar = new ListaCircular<>();

        minhaListaCicurlar.add("c0");
        System.out.println(minhaListaCicurlar);

        minhaListaCicurlar.remove(0);
        System.out.println(minhaListaCicurlar);

        minhaListaCicurlar.add("c1");
        minhaListaCicurlar.add("c2");
        minhaListaCicurlar.add("c3");

        System.out.println(minhaListaCicurlar);

        System.out.println(minhaListaCicurlar.get(0));
        System.out.println(minhaListaCicurlar.get(1));
        System.out.println(minhaListaCicurlar.get(2));
        System.out.println(minhaListaCicurlar.get(3));
    }
}
