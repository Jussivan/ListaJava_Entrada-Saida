import java.util.Scanner;
public class Questão5 {
    public static void main(String [] args){
        Scanner Ler = new Scanner(System.in);
        System.out.println("Informe o número de anos: ");
        int Anos = Ler.nextInt();
        System.out.println("Informe o número de meses: ");
        int Meses = Ler.nextInt();
        System.out.println("Informe o número de dias: ");
        int Dias = Ler.nextInt();
        int Resultado = (Anos*365)+(Meses*30)+(Dias*1);
        System.out.printf("O usuário tem %d anos,%d meses e %d dias de idade.\n"
                        + "Assim, sua idade em dias é de %d.",Anos,Meses,Dias,Resultado);
        Ler.close();
    }
}