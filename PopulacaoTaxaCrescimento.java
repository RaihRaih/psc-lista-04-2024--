/*Raissa Rodrigues - Sistemas de Informação
 - questao 5 */

import java.util.Scanner;

public class PopulacaoTaxaCrescimento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int populacaoA, populacaoB, repetir;
        double taxaCrescimentoA, taxaCrescimentoB;
        do {
            do {
                System.out.println("Informe a população A e a taxa de crescimento A:");
                populacaoA = scanner.nextInt();
                taxaCrescimentoA = scanner.nextDouble();
            } while (populacaoA <= 0 || taxaCrescimentoA < 0);

            do {
                System.out.println("Informe a população B e a taxa de crescimento B:");
                populacaoB = scanner.nextInt();
                taxaCrescimentoB = scanner.nextDouble();
            } while (populacaoB <= 0 || taxaCrescimentoB < 0);

            System.out.println("Digite [0] para sair do programa\nDigite [1] para continuar no programa");
            repetir = scanner.nextInt();

        } while (repetir != 0);

    }
}
