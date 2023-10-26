import java.util.Scanner;
public class Questão3 {
    public static void main(String [] args){
        Scanner Ler = new Scanner(System.in);
        System.out.println("Informe o tempo gasto na viagem: VALOR EM HORAS");
        float Tempo = Ler.nextFloat();
        System.out.println("Informe a velocidade média durante a viagem: VALOR EM KM/H");
        float Velocidade = Ler.nextFloat();
        float Autonomia = 12;
        float Distancia = Tempo * Velocidade;
        float Litros_Usados = Distancia / Autonomia;
        System.out.printf("Velocidade Média: %d\n"
                        + "Tempo: %d\n"
                        + "Distância Percorrida: %d\n"
                        + "Litros Usados: %d",Velocidade,Tempo,Distancia,Litros_Usados);
        Ler.close();
    }
}