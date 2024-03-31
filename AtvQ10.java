import java.util.Scanner;

public class AtvQ10 {
    public static void main (String[] m){
        Scanner teclado = new Scanner(System.in);

        int soma;
        System.out.println("Digite o valor 1:");
        int v1 = teclado.nextInt();
        System.out.println("Digite o valor 2:");
        int v2 = teclado.nextInt();
        
        soma = v1 + v2;

        if (soma < 10){
            System.out.println("Valor menor que 10.");
        } else if (soma >= 10){
            System.out.println("O valor da soma é:" +soma);
        }
        

        teclado.close();
}
}
