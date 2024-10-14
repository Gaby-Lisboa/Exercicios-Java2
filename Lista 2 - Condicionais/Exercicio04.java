import java.util.Scanner;

public class Exercicio04 {
    public void exerc04() {
        System.out.println("Programa para calcular total da viajem das férias ");
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Onde você pretende passar suas férias?\n 1 - Maceió\n 2 - Porto de galinhas\n");
        int destino = scanner.nextInt();

        System.out.printf("Com almoço/janta incluso?\n 1 - Sim\n 2 - Não\n");
        int refeicao = scanner.nextInt();

        double valorTotal = 3000.00;

        switch (destino){
            case 1:
                if (refeicao == 1){
                    System.out.printf("Seu destino é Maceió, com refeição inclusa e o valor total foi de R$ %.2f", valorTotal);
                } else if(refeicao == 2) {
                    valorTotal = valorTotal * 0.85;
                    System.out.printf("Seu destino é Maceió, sem refeição inclusa e o valor total foi de R$ %.2f", valorTotal);
                }
                break;
            case 2:
                if (refeicao == 1){
                    valorTotal = valorTotal * 0.6;
                    System.out.printf("Seu destino é Porto de galinhas, com refeição inclusa e o valor total foi de R$ %.2f", valorTotal);
                } else if(refeicao == 2) {
                    valorTotal = valorTotal * 0.45;
                    System.out.printf("Seu destino é Porto de galinhas, sem refeição inclusa e o valor total foi de R$ %.2f", valorTotal);
                }
                break;
        }
        scanner.close();
    }
}
