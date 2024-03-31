import java.util.Scanner;
public class AtvQ4 {
     public static void main (String[] m){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a sua temperatura:");
        int temperatura = teclado.nextInt();

        if (temperatura < 37){
            System.out.println("Você não está com febre!");
        } else if (temperatura >= 37){
            System.out.println("Você está com febre!");
        }
        
        teclado.close();
}
}
