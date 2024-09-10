package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operacoes operacoes = new Operacoes();

        System.out.println("Calculadora Simples");
        System.out.println("Escolha a operação: +, -, *, /, ^ (potenciação), r (raiz quadrada), > (maior), < (menor)");
        char operacao = scanner.next().charAt(0);

        double num1, num2 = 0;
        double resultado = 0;

        // Para potenciação e operações que usam dois números
        if (operacao != 'r') {
            System.out.println("Digite o primeiro número:");
            num1 = scanner.nextDouble();

            System.out.println("Digite o segundo número:");
            num2 = scanner.nextDouble();
        } else {  // Para raiz quadrada, só precisamos de um número
            System.out.println("Digite o número:");
            num1 = scanner.nextDouble();
        }

        switch (operacao) {
            case '+':
                resultado = operacoes.soma(num1, num2);
                break;
            case '-':
                resultado = operacoes.subtracao(num1, num2);
                break;
            case '*':
                resultado = operacoes.multiplicacao(num1, num2);
                break;
            case '/':
                resultado = operacoes.divisao(num1, num2);
                break;
            case '^':
                resultado = operacoes.potenciacao(num1, num2);
                break;
            case 'r':
                resultado = operacoes.radiciacao(num1);
                break;
            case '>':
                resultado = operacoes.maior(num1, num2);
                break;
            case '<':
                resultado = operacoes.menor(num1, num2);
                break;
            default:
                System.out.println("Operação inválida!");
                return;
        }

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
