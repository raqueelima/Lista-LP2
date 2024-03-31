import java.util.Scanner;

public class AtvQ9 {
     public static void main (String[] m){
        Scanner teclado = new Scanner(System.in);

        double sliquido, salario, perc;
        System.out.println("Digite o valor por horas de aula:");
        double haula = teclado.nextDouble();
        System.out.println("Digite as horas trabalhadas este mês:");
        double hmes = teclado.nextDouble();
        System.out.println("Digite o percentual de desconto do INSS:");
        double INSS = teclado.nextDouble();
        
        salario = haula * hmes;
        perc = salario* (INSS/100);
        sliquido = salario - perc;

        System.out.println("O seu salário liquido é de:" + sliquido);
        
        teclado.close();
}
}
