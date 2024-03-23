/*Raissa Rodrigues - Sistemas de Informação
 - questao 2 */

import java.util.Scanner;

public class NomeSenha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, senha;

        System.out.println("Digite seu nome e em seguida, uma senha:\nNOME: ");
        nome = scanner.nextLine();
        System.out.println("SENHA:");
        senha = scanner.nextLine();
        scanner.close();

        while (nome.equals(senha)) {//função equals que verifica os caracteres

            System.out.println("A senha nao pode ser igual ao nome do usuário!!\n\n");
            System.out.println("Digite seu nome e em seguida, uma senha:\nNOME: ");
            nome = scanner.nextLine();
            System.out.println("SENHA:");
            senha = scanner.nextLine();
        }

        System.out.println("Nome e senha válidos!!");
    }
}
