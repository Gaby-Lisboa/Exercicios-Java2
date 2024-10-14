import java.util.Scanner;

public class Exercicio05 {
    public void exerc05() {
        System.out.println("Programa de quantidade de estoque");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade atual em estoque:");
        int qtdAtual = scanner.nextInt();

        System.out.println("Digite a quantidade máxima em estoque:");
        int qtdMax = scanner.nextInt();

        System.out.println("Digite a quantidade mínima em estoque:");
        int qtdMin = scanner.nextInt();


        double qtdMedia = 0.0;
        qtdMedia = ((qtdMax+qtdMin)/2);

        if (qtdAtual >= qtdMedia){
            System.out.println("Não efetuar compra!");
        } else if (qtdAtual < qtdMax){
            System.out.println("Efetuar compra!");
        }

        scanner.close();
    }

}
