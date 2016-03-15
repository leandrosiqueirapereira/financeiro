package br.com.munif.financeiro;

import br.com.munif.financeiro.entidades.Pessoa;
import br.com.munif.financeiro.entidades.Titulo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author munif
 */
public class Programa {
    
    public static void main(String[] args) {
        System.out.println("Incio");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("financeiroPU");
        
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        entityManager.getTransaction().begin();
        Pessoa joao=new Pessoa();
        joao.setNome("João da Silva");
        entityManager.persist(joao);
        
        Titulo contaDeLuz=new Titulo();
        contaDeLuz.setPessoa(joao);
        entityManager.persist(contaDeLuz);
        
        entityManager.getTransaction().commit();
        
        entityManager.close();
        
        entityManagerFactory.close();
    }
    
}
