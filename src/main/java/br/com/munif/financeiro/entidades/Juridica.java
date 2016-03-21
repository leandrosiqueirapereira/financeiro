package br.com.munif.financeiro.entidades;

import javax.persistence.Entity;

@Entity
public class Juridica extends Pessoa {

    private String cnpj;

    public Juridica() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
