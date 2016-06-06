package br.com.munif.financeiro.repositorio;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.munif.financeiro.entidades.Caixa;
import br.com.munif.financeiro.entidades.Categoria;
import br.com.munif.financeiro.util.Persistencia;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class CategoriaRepositorio extends SuperEntidadeRepositorio<Categoria> {

    public CategoriaRepositorio(Class classe) {
        super(classe);
    }

    /**
     *
     * @author mrroot
     */
    @Override
    public List<Categoria> consultar() {
        EntityManager em = Persistencia.getInstancia().getEntityManager();
        Query consulta = em.createQuery("from Categoria obj order obj.nome");
        return consulta.getResultList();
    }

}
