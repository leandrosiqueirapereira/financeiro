package br.com.munif.financeiro.entidades;

import br.com.munif.financeiro.util.SuperEntidade;
import javax.persistence.Entity;

@Entity
public class FormaPagamento extends SuperEntidade {

    private String nome;

    public FormaPagamento() {
        nome = "Nova forma de pagamento";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
