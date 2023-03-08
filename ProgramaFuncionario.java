package com.mycompany.programafuncionario;

import java.util.Scanner;

public class ProgramaFuncionario {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Ler dados do funcionário
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o salário bruto do funcionário: ");
        double salarioBruto = scanner.nextDouble();
        System.out.print("Digite o imposto a ser pago pelo funcionário: ");
        double imposto = scanner.nextDouble();

        // Calcular salário líquido
        double salarioLiquido = salarioBruto - imposto;

        // Mostrar dados do funcionário
        System.out.println("Dados do funcionário:");
        System.out.println("Nome: " + nome);
        System.out.println("Salário líquido: " + salarioLiquido);

        // Aumentar salário do funcionário
        System.out.print("Digite a porcentagem de aumento do salário: ");
        double porcentagemAumento = scanner.nextDouble();
        salarioBruto += salarioBruto * (porcentagemAumento / 100);

        // Recalcular salário líquido
        salarioLiquido = salarioBruto - imposto;

        // Mostrar dados atualizados do funcionário
        System.out.println("Dados do funcionário após aumento de salário:");
        System.out.println("Nome: " + nome);
        System.out.println("Salário líquido: " + salarioLiquido);

        scanner.close();
    }
}
