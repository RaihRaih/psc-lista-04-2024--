/*Raissa Rodrigues - Sistemas de Informação
 - questão 07*/
import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}
