import java.util.Scanner;

public class AloMundo{
    public static void main (String[] m){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = teclado.nextLine();

        System.out.println("Digite sua idade:");
        int idade = teclado.nextInt();

        System.out.println("O seu nome é "+ nome +" e sua idade é "+ idade + " anos");
        teclado.close();
    }
}