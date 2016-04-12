package br.com.munif.financeiro;

import br.com.munif.financeiro.entidades.Pagamento;
import br.com.munif.financeiro.entidades.Saldo;
import br.com.munif.financeiro.negocio.SuperEntidadeService;
import br.com.munif.financeiro.util.Persistencia;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

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
        


//        SuperEntidadeService<Caixa> caixaService = new SuperEntidadeService<>(Caixa.class);
//        EntityManager entityManager = Persistencia.getInstancia().getEntityManager();
//        entityManager.getTransaction().begin();
//        Caixa caixa = new Caixa();
//        caixa.setNome("Novo caixa");
//        System.out.println(""
//                + caixaService.salvar(caixa));
//        entityManager.getTransaction().commit();
        //   entityManager.close();
//        Persistencia.getInstancia().encerra();
    }

}
