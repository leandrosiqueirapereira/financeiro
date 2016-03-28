package br.com.munif.financeiro;

import br.com.munif.financeiro.entidades.Caixa;
import br.com.munif.financeiro.entidades.Pessoa;
import br.com.munif.financeiro.entidades.Titulo;
import br.com.munif.financeiro.negocio.SuperEntidadeService;
import br.com.munif.financeiro.repositorio.SuperEntidadeRepositorio;
import br.com.munif.financeiro.util.Persistencia;
import java.util.List;
import javax.persistence.EntityManager;

public class Programa {

    public static void main(String[] args) {
        System.out.println("Incio");

        SuperEntidadeService<Caixa> caixaService = new SuperEntidadeService<>(Caixa.class);
        EntityManager entityManager = Persistencia.getInstancia().getEntityManager();
        entityManager.getTransaction().begin();
        Caixa caixa = new Caixa();
        caixa.setNome("Novo caixa");
        System.out.println(""
                + caixaService.salvar(caixa));
        entityManager.getTransaction().commit();
        //   entityManager.close();
//        Persistencia.getInstancia().encerra();
    }

}
