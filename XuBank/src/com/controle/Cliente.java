package com.controle;

public class Cliente {
    private String nome;
    private String cpf;
    private String senha;
    private String tipo; // Pode ser "regular", "gold" ou "vip"

    // Construtor
    public Cliente(String nome, String cpf, String senha, String tipo) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.tipo = tipo;
    }

    // Métodos getters e setters para os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
               "nome='" + nome + '\'' +
               ", cpf='" + cpf + '\'' +
               ", tipo='" + tipo + '\'' +
               '}';
    }
}

