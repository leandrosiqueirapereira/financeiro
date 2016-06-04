package br.com.munif.financeiro.repositorio;

import br.com.munif.financeiro.entidades.Categoria;
import br.com.munif.financeiro.util.Persistencia;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class CategoriaRepositorio extends SuperEntidadeRepositorio<Categoria>{
    
    public CategoriaRepositorio(Class classe) {
        super(classe);
    }
    @Override
    public List<Categoria> consultar() {
        EntityManager em = Persistencia.getInstancia().getEntityManager();
        Query consulta = em.createQuery("from Categoria obj order obj.nome");
        return consulta.getResultList();
    }
    
}