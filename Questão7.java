import java.util.Scanner;
public class Questão7 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        int Cem=0,Cinquenta=0,Dez=0,Cinco=0,Um=0;
        System.out.println("Informe o valor do saque: ");
        int Quantia = Ler.nextInt();
        while(Quantia>=1){
            if(Quantia>=100){
                Cem++;
                Quantia = Quantia - 100;
            } else if(Quantia>=50){
                Cinquenta++;
                Quantia = Quantia - 50;
            } else if(Quantia>=10){
                Dez++;
                Quantia = Quantia - 10;
            } else if(Quantia>=5){
                Cinco++;
                Quantia-=5;
            } else if(Quantia>=1){
                Um++;
                Quantia = Quantia - 1;
            }
        }
        System.out.printf("O valor do saque pode ser expresso em:\n%d notas de 100\n%d notas de 50\n%d notas de 10\n%d notas de 5\n%d notas de 1",Cem,Cinquenta,Dez,Cinco,Um);
    }
}