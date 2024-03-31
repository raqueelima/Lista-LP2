import java.util.Scanner;

public class AtvQ6 {
    public static void main (String[] m){
        Scanner teclado = new Scanner(System.in);

        double media;
        System.out.println("Digite a nota da sua primeira prova:");
        double n1 = teclado.nextDouble();
        System.out.println("Digite a nota da sua segunda prova:");
        double n2 = teclado.nextDouble();
        System.out.println("Digite a nota do seu trabalho:");
        double trab = teclado.nextDouble();

        media = (n1 + n2 + trab)/3;


        if (media >= 7){
            System.out.println("Aprovado! ");
        } else if (media < 7) {
            System.out.println("Reprovado!");
        }
        
        teclado.close();
}
}
