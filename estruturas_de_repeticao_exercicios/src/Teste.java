public class Teste {
    public static void main(String[] args) {
        /*int i, num = 5;
        for (i = 0; i < 3; i++) {
            
            num = num + i;
            System.out.print(num);
        }*/

        int num2 = 5, count = 1;
        while(count <= 3) {
            ++count;
            num2 += count;
        }
        System.out.println("\n"+num2);
    }
       
    
}
