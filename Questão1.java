import java.util.Scanner;
public class Questão1 {
    public static void main(String [] args){
        Scanner Ler = new Scanner(System.in);
        System.out.println("Informe o valor que deseja gerar a tabuada: ");
        int Valor = Ler.nextInt();
        for(int rep=1;rep<=10;rep++){
            System.out.printf("%d X %d = %d\n",Valor,rep,Valor*rep);
        }
    }
}
