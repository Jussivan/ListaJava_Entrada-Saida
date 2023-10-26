import java.util.Scanner;
public class Questão2 {
    public static void main(String [] args){
        Scanner Ler = new Scanner(System.in);
        System.out.println("Informe o valor em Celsius: ");
        float Celsius = Ler.nextFloat();
        float Fahrenheit = (9 * Celsius + 160) / 5;
        System.out.printf("O valor em Fahrenheit é %f",Fahrenheit);
        Ler.close();
    }
}
