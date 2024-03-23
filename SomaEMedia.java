/*Raissa Rodrigues - Sistemas de Informação
 - questao 8 */

import java.util.Scanner;

public class SomaEMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        double media = (double) soma / 5;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}

