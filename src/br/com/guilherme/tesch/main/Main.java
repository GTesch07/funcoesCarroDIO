package br.com.guilherme.tesch.main;

import java.util.Scanner;

import br.com.guilherme.tesch.models.Carro;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var carro = new Carro();
        var opcao = -1;

        do {
            System.out.println("\n==== Menu do Carro ====\n");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir Velocidade");
            System.out.println("5 - Aumentar Marcha");
            System.out.println("6 - Diminuir Marcha");
            System.out.println("7 - Virar a Direita");
            System.out.println("8 - Virar a Esquerda");
            System.out.println("9 - Verificar Velocidade");
            System.out.println("0 - Sair");
            System.out.println("\n=======================\n");
            try {
                opcao = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Opção inválida! Por favor, digite apenas números.");
                scanner.nextLine();
                continue;
            }
            switch (opcao) {
                case 1 -> carro.ligarCarro();
                case 2 -> carro.desligarCarro();
                case 3 -> carro.acelerar();
                case 4 -> carro.diminuirVelocidade();
                case 5 -> carro.aumentarMarcha();
                case 6 -> carro.diminuirMarcha();
                case 7 -> carro.virarDireita();
                case 8 -> carro.virarEsquerda();
                case 9 -> carro.verificarVelocidade();
                case 0 -> {
                    System.out.println("Saindo do programa...");
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida!");
            }
        } while (true);
    }
}
