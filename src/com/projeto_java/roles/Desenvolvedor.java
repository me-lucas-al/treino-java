package com.projeto_java.roles;

import com.projeto_java.employee.Autenticavel;
import com.projeto_java.employee.Funcionario;

import java.util.Objects;

public class Desenvolvedor extends Funcionario implements Autenticavel {
    private double bonus = 1.1;
    private String senha;

    public Desenvolvedor(String nome, String cpf ) {
        super(nome, cpf );
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
        return getSalarioBase() * bonus;
    }

    @Override
    public String getDados() {
        return "\nSalário Final: " + calcularSalario();
    }
}
