package br.com.munif.financeiro.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Persistencia {

    private static Persistencia instancia = new Persistencia();

    public static Persistencia getInstancia() {
        return instancia;
    }

    private final EntityManagerFactory entityManagerFactory;

    private Persistencia() {
        entityManagerFactory = Persistence.createEntityManagerFactory("financeiroPU");
    }

    public EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

    public void encerra() {
        entityManagerFactory.close();
    }

}
