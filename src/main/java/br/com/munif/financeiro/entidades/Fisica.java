package br.com.munif.financeiro.entidades;

import javax.persistence.Entity;

@Entity
public class Fisica extends Pessoa {

    private String cpf;

    public Fisica() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
