import java.util.Scanner;

public class Exercicio01 {
    public void exerc01() {
        System.out.println("Programa para classificação de faixa etária");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma idade:");
        int idade = scanner.nextInt();

        if (idade >= 0 && idade <= 14) {
            System.out.println("Classificação: Criança");
        } else if(idade >= 15 && idade <= 17) {
            System.out.println("Classificação: Adolescente");
        } else if(idade >= 18 && idade <= 30){
            System.out.println("Classificação: Jovem Adulto");
        } else {
            System.out.println("Classificação: Adulto");
        }
        scanner.close();
    }
}
