package br.com.munif.financeiro.repositorio;

import br.com.munif.financeiro.util.Persistencia;
import br.com.munif.financeiro.util.SuperEntidade;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class SuperEntidadeRepositorio<T extends SuperEntidade> {

    private final Class<T> classe;

    public Class<T> getClasse() {
        return classe;
    }

    public SuperEntidadeRepositorio(Class classe) {
        this.classe = classe;
    }

    public T consultar(Long codigo) {
        EntityManager em = Persistencia.getInstancia().getEntityManager();
        return em.find(classe, codigo);
    }

    public List<T> consultar() {
        EntityManager em = Persistencia.getInstancia().getEntityManager();
        Query consulta = em.createQuery("from " + classe.getSimpleName() + " obj");
        return consulta.getResultList();
    }

    public T salvar(T obj) {
        EntityManager em = Persistencia.getInstancia().getEntityManager();
        return em.merge(obj);
    }

    public void excluir(T obj) {
        EntityManager em = Persistencia.getInstancia().getEntityManager();
        obj = consultar(obj.getCodigo());
        if (obj == null) {
            throw new RuntimeException("Este " + classe.getSimpleName() + " foi removido em outra operação");
        }
        em.remove(obj);
    }

}
