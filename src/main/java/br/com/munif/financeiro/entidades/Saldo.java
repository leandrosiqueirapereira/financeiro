package br.com.munif.financeiro.entidades;

import br.com.munif.financeiro.util.SuperEntidade;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

@Entity
public class Saldo extends SuperEntidade {

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date quando;

    private BigDecimal valor;
    @ManyToOne
    private Caixa caixa;

    public Saldo() {
        quando = new Date();
        valor = BigDecimal.ZERO;
    }

    public Date getQuando() {
        return quando;
    }

    public void setQuando(Date quando) {
        this.quando = quando;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

}
