import java.util.Scanner;
public class Questão4 {
    public static void main(String [] args){
        Scanner Ler = new Scanner(System.in);
        System.out.println("Informe a cotação do dólar: ");
        float Cotacao = Ler.nextFloat();
        System.out.println("Informe o valor em dólares: ");
        float Dolar = Ler.nextFloat();
        float Real = Dolar * Cotacao;
        System.out.printf("O valor em Reais é R$%f",Real);
        Ler.close();
    }
}
