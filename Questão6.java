import java.util.Scanner;
public class Questão6 {
    public static void main(String [] args){
        Scanner Ler = new Scanner(System.in);
        System.out.println("Informe a duração em segundos: ");
        int Segundos = Ler.nextInt();
        int Horas = Segundos / 3600;
        Segundos = Segundos%3600;
        int Minutos = Segundos / 60;
        Segundos = Segundos % 60;
        System.out.printf("Duração do Evento: %d:%d:%d",Horas,Minutos,Segundos);
        Ler.close();
    }
}
