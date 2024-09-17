package org.example;

public class Operacoes2 {
    // Método para soma
    public double soma(double a, double b) {
        return a + b;
    }

    // Método para subtração
    public double subtracao(double a, double b) {
        return a - b;
    }

    // Método para multiplicação
    public double multiplicacao(double a, double b) {
        return a * b;
    }

    // Método para divisão
    public double divisao(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: Divisão por zero!");
            return 0;
        }
    }

    // Método para potenciação
    public double potenciacao(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    // Método para radiciação (raiz quadrada)
    public double radiciacao(double a) {
        if (a >= 0) {
            return Math.sqrt(a);
        } else {
            System.out.println("Erro: Não existe raiz quadrada de número negativo!");
            return 0;
        }
    }

    // Método para encontrar o maior número
    public double maior(double a, double b) {
        return Math.max(a, b);
    }

    // Método para encontrar o menor número
    public double menor(double a, double b) {
        return Math.min(a, b);
    }
}





