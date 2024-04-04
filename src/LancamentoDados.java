import java.security.SecureRandom;
import java.util.Scanner;


public class LancamentoDados {

    public static void main(String[] args) {

        SecureRandom randomNumbers = new SecureRandom();
        Scanner input = new Scanner(System.in);

        int[] frequency = new int[7];

        System.out.print("Digite o número de vezes que deseja lançar o dado: ");
        int n = input.nextInt();

        for(int i = 0; i <= n; i++) {

            int numero = 1 + randomNumbers.nextInt(6);

            ++frequency[numero];

        }

        System.out.println("Frequência dos números: ");
        System.out.println("1: " + frequency[1]);
        System.out.println("2: " + frequency[2]);
        System.out.println("3: " + frequency[3]);
        System.out.println("4: " + frequency[4]);
        System.out.println("5: " + frequency[5]);
        System.out.println("6: " + frequency[6]);


    }

}
