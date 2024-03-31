import java.util.Scanner;

public class AtvQ5 {
    public static void main (String[] m){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        int n1 = teclado.nextInt();
        System.out.println("Digite o segundo número:");
        int n2 = teclado.nextInt();

        if (n1 < n2){
            System.out.println("O maior número é "+ n2);
        } else if (n1 > n2){
            System.out.println("O maior número é"+ n1);
        }
        
        teclado.close();
}
}
