package com.projeto_java.roles;

import com.projeto_java.employee.Autenticavel;
import com.projeto_java.employee.Funcionario;

import java.util.Objects;

public class Gerente extends Funcionario implements Autenticavel {
    private int bonus = 2000;
    private String senha;

    public Gerente(String nome, String cpf ) {
        super(nome, cpf);
    }

    public void setSenha( String senha) {
        this.senha = senha;
    }


    @Override
    public boolean login(String senhaDigitada) {
        return Objects.equals(this.senha, senhaDigitada);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }

    @Override
    public String getDados() {
        return "\nSalário Final: " + calcularSalario();
    }
}
