package br.com.munif.financeiro.api;

import br.com.munif.financeiro.entidades.MovimentoCaixa;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "MovimentoCaixaApi", urlPatterns = {"/api/movimentocaixa/*"})
public class MovimentoCaixaApi extends SuperEntidadeApi<MovimentoCaixa> {

    @Override
    public Class<MovimentoCaixa> getClasse() {
        return MovimentoCaixa.class;
    }

}
