import java.util.Scanner;

public class AtvQ7 {
    public static void main (String[] m){
        Scanner teclado = new Scanner(System.in);

        double imc;
        System.out.println("Digite a sua altura:");
        double altura = teclado.nextDouble();
        System.out.println("Digite o seu peso:");
        double peso = teclado.nextDouble();
     

        imc = peso/(altura*altura);


        if (imc >= 30){
            System.out.println("Obeso! ");
        } else if (imc < 30) {
            System.out.println("Não obeso!");
        }
        
        teclado.close();
}
}
