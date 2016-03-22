package br.com.munif.financeiro;

import br.com.munif.financeiro.entidades.Caixa;
import br.com.munif.financeiro.entidades.Pessoa;
import br.com.munif.financeiro.entidades.Titulo;
import br.com.munif.financeiro.repositorio.SuperEntidadeRepositorio;
import br.com.munif.financeiro.util.Persistencia;
import java.util.List;
import javax.persistence.EntityManager;

public class Programa {
    
    public static void main(String[] args) {
        System.out.println("Incio");
        
        List<Caixa> listaDeCaixa;
        
        SuperEntidadeRepositorio<Caixa> caixaRepositorio=new SuperEntidadeRepositorio<>(Caixa.class);
        
        EntityManager entityManager = Persistencia.getInstancia().getEntityManager();
        
        entityManager.getTransaction().begin();
        Pessoa joao=new Pessoa();
        joao.setNome("João da Silva");
        entityManager.persist(joao);
        
        Titulo contaDeLuz=new Titulo();
        contaDeLuz.setPessoa(joao);
        entityManager.persist(contaDeLuz);
        
        entityManager.getTransaction().commit();
        
        entityManager.close();
        
        Persistencia.getInstancia().encerra();
    }
    
}
