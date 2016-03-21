package br.com.munif.financeiro.entidades;

import br.com.munif.financeiro.util.SuperEntidade;
import javax.persistence.Entity;

@Entity
public class Categoria extends SuperEntidade {

    private String nome;

    public Categoria() {
        nome = "nova categoria";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
