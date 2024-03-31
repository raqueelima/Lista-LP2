import java.util.Scanner;

public class AtvQ8 {
    public static void main (String[] m){
        Scanner teclado = new Scanner(System.in);

        double area;
        System.out.println("Digite o raio da circunferência:");
        double raio = teclado.nextDouble();
        
        area = 3.14 * (raio*raio);

        System.out.println("A área da circunferência é de aproximadamente "+ area + " cm.");
        
        teclado.close();
}
}
