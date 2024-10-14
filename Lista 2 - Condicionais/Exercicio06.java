import java.util.Scanner;
import java.util.Random;

public class Exercicio06 {
    public void exerc06() {
        System.out.println("Programa de adivinhar número aleatório");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numAle = random.nextInt(101);
        int tentativas = 3;

        for (int i = 0; i < tentativas; i++) {
            System.out.println("Digite um número inteiro para acertar o número aleatório:");
            int num = scanner.nextInt();

            if (num == numAle) {
                System.out.println("Você acertou!");
                break;
            } else {
                System.out.println("Você errou! Tentativas restantes: " + (tentativas - 1 - i));
            }

            if (i == tentativas - 1) {
                System.out.println("Você esgotou suas tentativas. O número era: " + numAle);
            }
        }

        scanner.close();
    }
}
