package br.com.munif.financeiro;

<<<<<<< HEAD
import br.com.munif.financeiro.entidades.Caixa;
import br.com.munif.financeiro.entidades.MovimentoCaixa;
import br.com.munif.financeiro.entidades.Saldo;
import br.com.munif.financeiro.negocio.SuperEntidadeService;
import br.com.munif.financeiro.util.Persistencia;
import br.com.munif.financeiro.util.SuperEntidade;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.EntityManager;
=======
import br.com.munif.financeiro.entidades.Pagamento;
import br.com.munif.financeiro.entidades.Saldo;
import br.com.munif.financeiro.negocio.SuperEntidadeService;
import br.com.munif.financeiro.util.Persistencia;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
>>>>>>> 358b6331c011dc952dae0c6b2d18592ccb4b571e

public class Programa {

    public static void main(String[] args) throws JsonProcessingException, IOException {
        System.out.println("Incio");
//        
//        String json="{\"codigo\":1459208252077000,\"quando\":1459208252077,\"valor\":0,\"caixa\":{\"codigo\":1459208252076000,\"nome\":\"Caixa central\"}}";
//                
//        ObjectMapper mapper = new ObjectMapper();
//        Saldo saldo=mapper.readValue(json, Saldo.class);
//        
//        System.out.println("--->"+saldo.getCaixa().getNome());
        SuperEntidadeService<Pagamento>  entidadeService =new SuperEntidadeService<>(Pagamento.class);
        EntityManager entityManager  =Persistencia.getInstancia().getEntityManager();
        entityManager.getTransaction().begin();
        Pagamento pagamento=new Pagamento();
        
<<<<<<< HEAD
        String json="{\"codigo\":1459208252077000,\"quando\":1459208252077,\"valor\":0,\"caixa\":{\"codigo\":1459208252076000,\"nome\":\"Caixa central\"}}";
                
        ObjectMapper mapper = new ObjectMapper();
        Saldo saldo=mapper.readValue(json, Saldo.class);
        
        System.out.println("--->"+saldo.getCaixa().getNome());
        
        SuperEntidadeService<Caixa> caixaService = new SuperEntidadeService<>(Caixa.class);
        EntityManager entityManager = Persistencia.getInstancia().getEntityManager();
        entityManager.getTransaction().begin();
        Caixa caixa = new Caixa();
        caixa.setNome("Novo caixa");
        System.out.println("------------>>>>>>>>>>>> "
                + caixaService.salvar(caixa));
        entityManager.getTransaction().commit();
           entityManager.close();
        Persistencia.getInstancia().encerra();
        
//        SuperEntidadeService<MovimentoCaixa> movimentoCaixaService = new SuperEntidadeService<>(MovimentoCaixa.class);
//        EntityManager entityManager2 = Persistencia.getInstancia().getEntityManager();
=======


//        SuperEntidadeService<Caixa> caixaService = new SuperEntidadeService<>(Caixa.class);
//        EntityManager entityManager = Persistencia.getInstancia().getEntityManager();
>>>>>>> 358b6331c011dc952dae0c6b2d18592ccb4b571e
//        entityManager.getTransaction().begin();
//        MovimentoCaixa movimentoCaixa = new MovimentoCaixa();
//        movimentoCaixa.setCaixa(caixa);
//        movimentoCaixa.setHistorico("Histórico");
//        movimentoCaixa.setRealizado(true);
//        movimentoCaixa.setValor(new BigDecimal("1000"));
//        System.out.println("------------>>>>>>>>>>>> "
//                + movimentoCaixaService.salvar(movimentoCaixa));
//        entityManager2.getTransaction().commit();
//           entityManager2.close();
//        Persistencia.getInstancia().encerra();        
        
    }

}
