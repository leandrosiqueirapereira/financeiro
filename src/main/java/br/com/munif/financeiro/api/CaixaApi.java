package br.com.munif.financeiro.api;

import br.com.munif.financeiro.entidades.Caixa;
<<<<<<< HEAD
import br.com.munif.financeiro.negocio.SuperEntidadeService;
=======
>>>>>>> 358b6331c011dc952dae0c6b2d18592ccb4b571e
import javax.servlet.annotation.WebServlet;

    @WebServlet(name = "CaixaApi", urlPatterns = {"/api/caixa/*"})
    public class CaixaApi extends SuperEntidadeApi<Caixa> {

        @Override
        public Class<Caixa> getClasse() {
            return Caixa.class;
        }

    }
