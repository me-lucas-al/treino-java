package com.projeto_java.employee;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase = 3000;

    protected Funcionario(String nome, String cpf ) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract double calcularSalario();

    public double getSalarioBase() {
        return salarioBase;
    }

    public String getDados() {
        return "Nome: " + nome +
                "\nCPF: " + cpf;
    }
}
