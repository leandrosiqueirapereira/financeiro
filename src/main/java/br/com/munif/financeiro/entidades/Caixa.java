package br.com.munif.financeiro.entidades;

import br.com.munif.financeiro.util.SuperEntidade;
import javax.persistence.Entity;

@Entity
public class Caixa extends SuperEntidade {

    private String nome;

    public Caixa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    

}
