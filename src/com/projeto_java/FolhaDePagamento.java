package com.projeto_java;

import com.projeto_java.employee.Funcionario;

public class FolhaDePagamento {
    private double totalFolha;

    public void registrar (Funcionario f) {
        double salario = f.calcularSalario();
        String dadosFuncionario = f.getDados();
        this.totalFolha += salario;

        IO.println("Registrando funcionario: " + dadosFuncionario);
    }

    public void getTotalFolha() {
        IO.println("\nTotal de salário registrado na folha: R$" + this.totalFolha);
    }

}
