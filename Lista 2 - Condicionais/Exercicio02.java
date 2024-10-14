import java.util.Scanner;

public class Exercicio02 {
    public void exerc02(){
        System.out.println("Programa que calcula o valor total da compra");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto:");
        float valor = scanner.nextFloat();

        System.out.println("Digite a quantidade de produtos desejada:");
        int quantidade = scanner.nextInt();

        double valorTotal = 0.0;

        if (quantidade <= 12){
            valorTotal = valor * quantidade;
        } else {
            valorTotal = ((valor * quantidade) * 0.9);
        }

        System.out.printf("O valor total da compra é de: %.2f", valorTotal);
        scanner.close();
    }
}
