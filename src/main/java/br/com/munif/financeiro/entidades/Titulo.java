package br.com.munif.financeiro.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Titulo extends SuperEntidade{
    
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;
    
    @ManyToOne
    private Pessoa pessoa;

    public Titulo() {
        dataVencimento=new Date();
    }
    
    

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
    
}
