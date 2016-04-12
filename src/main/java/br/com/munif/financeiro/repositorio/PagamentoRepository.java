package br.com.munif.financeiro.repositorio;

import br.com.munif.financeiro.entidades.Pagamento;
import br.com.munif.financeiro.util.Persistencia;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class PagamentoRepository extends SuperEntidadeRepositorio<Pagamento>{
    
    public PagamentoRepository(Class classe) {
        super(classe);
    }
    @Override
    public List<Pagamento> consultar() {
        EntityManager em = Persistencia.getInstancia().getEntityManager();
        Query consulta = em.createQuery("from Pagamento obj order obj.nome");
        return consulta.getResultList();
    }
    
}
