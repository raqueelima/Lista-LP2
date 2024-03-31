import java.util.Scanner;

public class AtvQ2{
    public static void main (String[] m){
        float qntdlitro, plitro ;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o preço atual da gasolina:");
        float gasolina = teclado.nextFloat();

        System.out.println("Digite a distância que será percorrida:");
        float distancia = teclado.nextFloat();

       qntdlitro = distancia/12;
       plitro = qntdlitro * gasolina;

        System.out.println("Você precisará de" +qntdlitro+ "litros de gasolina e o preço é" +plitro+ "reais");
        teclado.close();
    }
}