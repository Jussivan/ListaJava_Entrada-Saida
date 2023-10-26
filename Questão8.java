import java.util.Scanner;
public class Questão8 {
    public static void main(String [] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Informe o valor da diária: ");
        float Diaria = Ler.nextFloat();
        float Diaria_Promocao = (float) (Diaria - (Diaria * 0.22));
        float ValorSemPromocao = (float) (Diaria * (42 * 0.4));
        float ValorComPromocao = (float) (Diaria_Promocao * (42 * 0.7));
        float Resultado = ValorComPromocao - ValorSemPromocao;
        
        System.out.printf("Diária com Promoção: %.3f\n"
                        + "Valor Arrecadado Sem Promoção: %.3f\n"
                        + "Valor Arrecadado Com Promoção: %.3f\n"
                        + "Lucro ou Prejuízo Mensal: %.3f\n",Diaria_Promocao,ValorSemPromocao,ValorComPromocao,Resultado);
        Ler.close();
    }
}