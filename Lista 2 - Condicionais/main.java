import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exercicio01 exerc01 = new Exercicio01();
        Exercicio02 exerc02 = new Exercicio02();
        Exercicio03 exerc03 = new Exercicio03();
        Exercicio04 exerc04 = new Exercicio04();
        Exercicio05 exerc05 = new Exercicio05();
        Exercicio06 exerc06 = new Exercicio06();
        Exercicio07 exerc07 = new Exercicio07();



        System.out.println("Lista 1 - Entrada e saída");

        System.out.println("""
        Escolha um exercício para ser executado:
        [1] - Exercicio 01 (Programa para classificação de faixa etária)
        [2] - Exercício 02 (Programa que calcula o valor total da compra)
        [3] - Exercicio 03 (Programa para mostrar quem venceu o jogo)
        [4] - Exercicio 04 Programa para calcular total da viajem das férias)
        [5] - Exercicio 05 Programa de quantidade de estoque)
        [6] - Exercicio 06 (Programa de adivinhar número aleatório)
        [7] - Exercicio 07 (Programa de perguntas aleatórias)
        """);
        int escolha = scanner.nextInt();

        switch (escolha){
            case 1:
                exerc01.exerc01();
                break;
            case 2:
                exerc02.exerc02();
                break;
            case 3:
                exerc03.exerc03();
                break;
            case 4:
                exerc04.exerc04();
                break;
            case 5:
                exerc05.exerc05();
                break;
            case 6:
                exerc06.exerc06();
                break;
            case 7:
                exerc07.exerc07();
                break;
        }
    }
}
