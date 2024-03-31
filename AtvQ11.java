import java.util.Scanner;

public class AtvQ11 {
    public static void main (String[] m){
        Scanner teclado = new Scanner(System.in);

        int soma, menor, maior;
        System.out.println("Digite o valor 1:");
        int v1 = teclado.nextInt();
        System.out.println("Digite o valor 2:");
        int v2 = teclado.nextInt();
        
        soma = v1 + v2;

        if (soma < 10){
            menor = soma - 7;
            System.out.println("O valor da soma é:" +menor);
        } else if (soma >= 10){
            maior = soma + 5;
            System.out.println("O valor da soma é:" +maior);
        }
        

        teclado.close();
}
}
