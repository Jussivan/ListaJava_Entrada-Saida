import java.util.Scanner;
public class Questão9 {
    public static void main(String [] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Informe o valor de 3 dígitos: ");
        int Centena,Dezena,Unidade;
        int valor = Ler.nextInt();
        Centena = valor/100;
        valor = valor%100;
        Dezena = valor/10;
        valor = valor%10;
        Unidade = valor;
        System.out.printf("O valor original é: %d%d%d\n",Centena,Dezena,Unidade);
        System.out.printf("O valor invertido é: %d%d%d",Unidade,Dezena,Centena);
        Ler.close();
    }
}