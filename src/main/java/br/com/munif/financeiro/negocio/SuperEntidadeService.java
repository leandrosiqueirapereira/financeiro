package br.com.munif.financeiro.negocio;

import br.com.munif.financeiro.repositorio.SuperEntidadeRepositorio;
import br.com.munif.financeiro.util.Persistencia;
import br.com.munif.financeiro.util.SuperEntidade;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class SuperEntidadeService<T extends SuperEntidade> {

    private final Class<T> classe;

    private final SuperEntidadeRepositorio<T> repositorio;

    public SuperEntidadeService(Class classe) {
        this.classe = classe;
        this.repositorio = new SuperEntidadeRepositorio<>(classe);
    }

    public SuperEntidadeService(SuperEntidadeRepositorio<T> repositorio) {
        this.classe = repositorio.getClasse();
        this.repositorio = repositorio;
    }

    public T consultar(Long codigo) {
        return repositorio.consultar(codigo);
    }

    public List<T> consultar() {
        return repositorio.consultar();
    }

    public T salvar(T obj) {
        return repositorio.salvar(obj);
    }

    public void excluir(T obj) {
        repositorio.excluir(obj);
    }

}
