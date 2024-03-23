/*Raissa Rodrigues - Sistemas de Informação
 - questao 3 */

import java.util.Scanner;

public class ValidaInformacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        float salario;
        char sexo, estadoCivil;

        do {
            System.out.println("Nome: ");
            nome = scanner.nextLine();
        } while (nome.length() < 3);

        do {
            System.out.println("Idade: ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);

        do {
            System.out.println("Salário: ");
            salario = scanner.nextFloat();
        } while (salario <= 0);

        do {
            System.out.println("Sexo (f/m): ");
            sexo = scanner.next().charAt(0);
        } while (sexo != 'f' && sexo != 'm');

        do {
            System.out.println("Estado Civil (s/c/v/d): ");
            estadoCivil = scanner.next().charAt(0);
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

        System.out.println("\n\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        scanner.close();

    }
}
