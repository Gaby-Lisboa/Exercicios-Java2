import java.util.Scanner;

public class Exercicio07 {
    public void exerc07(){
        System.out.println("Programa de perguntas aleatórias");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual pergunta você deseja responder 1 ou 2?");
        int pergunta = scanner.nextInt();
        scanner.nextLine();

        switch (pergunta){
            case 1:
                System.out.println("""
                Qual a melhor turma de DS?
                [A] - DS1
                [B] - DS11
                [C] - DS111
                """);
                String resposta = scanner.nextLine();
                resposta = resposta.toLowerCase();

                if (resposta.equals("b")) {
                    System.out.println("Você acertou, pode retirar seu bônus na Shostners and Shostners");
                } else {
                    System.out.println("Você não acertou, mas tente novamente numa próxima");
                }
                break;
            case 2:
                System.out.println("""
                Qual a melhor linguagem de programação?
                [A] - Java
                [B] - Python
                [C] - Nenhuma das anteriores
                """);
                resposta = scanner.nextLine();
                resposta = resposta.toLowerCase();

                if (resposta.equals("c")) {
                    System.out.println("Você acertou, pode retirar seu bônus na Shostners and Shostners");
                } else {
                    System.out.println("Você não acertou, mas tente novamente numa próxima");
                }
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
        }

        scanner.close();
    }
}
