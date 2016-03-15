package br.com.munif.financeiro.entidades;

import javax.persistence.Entity;

@Entity
public class Pessoa extends SuperEntidade{

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
