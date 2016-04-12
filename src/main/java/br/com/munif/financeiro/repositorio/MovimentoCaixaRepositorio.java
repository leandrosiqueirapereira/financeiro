package br.com.munif.financeiro.repositorio;

import br.com.munif.financeiro.entidades.MovimentoCaixa;
import br.com.munif.financeiro.util.Persistencia;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class MovimentoCaixaRepositorio extends SuperEntidadeRepositorio<MovimentoCaixa> {

    public MovimentoCaixaRepositorio() {
        super(MovimentoCaixa.class);
    }

    @Override
    public List<MovimentoCaixa> consultar() {
        EntityManager em = Persistencia.getInstancia().getEntityManager();
        Query consulta = em.createQuery("from MovimentoCaixa");
        return consulta.getResultList();
    }

}
