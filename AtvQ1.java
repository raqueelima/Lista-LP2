import java.util.Scanner;

public class AtvQ1{
    public static void main (String[] m){
        long salario;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite as horas trabalhadas no mês:");
        long horas = teclado.nextLong();

        salario = horas * 20;

        System.out.println("O seu salário do mês é:" + salario);
        teclado.close();
    }
}