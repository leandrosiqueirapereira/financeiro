package br.com.munif.financeiro.repositorio;

import br.com.munif.financeiro.entidades.Caixa;
import br.com.munif.financeiro.util.Persistencia;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class CaixaRepositorio extends SuperEntidadeRepositorio<Caixa> {

    public CaixaRepositorio() {
        super(Caixa.class);
    }

    @Override
    public List<Caixa> consultar() {
        EntityManager em = Persistencia.getInstancia().getEntityManager();
        Query consulta = em.createQuery("from Caixa obj order obj.nome");
        return consulta.getResultList();
    }

}
