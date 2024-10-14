import java.util.Scanner;

public class Exercicio03 {
    public void exerc03() {
        System.out.println("Programa para mostrar quem venceu o jogo");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de gols do time A:");
        int golsA = scanner.nextInt();

        System.out.println("Digite a quantidade de gols do time B:");
        int golsB = scanner.nextInt();

        if (golsA>golsB){
            System.out.printf("Time A ganhou do Time B com %d gol(s)", golsA);
        } else if (golsB>golsA){
            System.out.printf("Time B ganhou do Time A com %d gol(s)", golsB);
        } else {
            System.out.println("Os times empataram a partida");
        }
        scanner.close();
    }
}
