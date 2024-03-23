/*Raissa Rodrigues - Sistemas de Informação
 - questao 9 */
public class NumerosImpares {

    public static void main(String[] args) {
        System.out.println("Números ímpares entre 1 e 50:");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
