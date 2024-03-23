/*Raissa Rodrigues - Sistemas de Informação
 - questao 4 */

public class TaxaCrescimento {

    public static void main(String[] args) {

        double paisA = 80000, paisB = 200000, taxaA = 0.03, taxaB = 0.015, crescimentoAnualA, crescimentoAnualB, novaPopulacaoA, novaPopulacaoB;
        int anos = 0;

        crescimentoAnualA = paisA * taxaA;
        crescimentoAnualB = paisB * taxaB;

        novaPopulacaoA = crescimentoAnualA + paisA;
        novaPopulacaoB = crescimentoAnualB + paisB;

        // System.out.println(crescimentoAnualA + " \n" + crescimentoAnualB + " \n" + novaPopulacaoA + "\n" + novaPopulacaoB + "\n");
        while (paisA < paisB) {
            paisA += (int) (paisA * taxaA);
            paisB += (int) (paisB * taxaB);
            anos++;
        }
        System.out.println("Número de anos necessários para que A ultrapasse ou iguale B: " + anos + " anos.");
    }
}
