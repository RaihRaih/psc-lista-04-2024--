/*Raissa Rodrigues - Sistemas de Informação
 - questao 1 */

import java.util.Scanner;

public class NotaValida {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        System.out.println("Digite uma nota de 0 a 10: ");
        nota = scanner.nextDouble();

        scanner.close();

        while (nota < 0 || nota > 10) {
            System.out.println("Digite uma nota de 0 a 10: ");
            nota = scanner.nextDouble();
        }
        System.out.println("nota Valida! , " + nota);

    }
}
