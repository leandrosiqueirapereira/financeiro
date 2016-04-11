package br.com.munif.financeiro.api;

import br.com.munif.financeiro.entidades.Caixa;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MovimentoCaixaApi", urlPatterns = {"/api/movimentocaixa/*"})
public class MovimentoCaixaApi extends SuperEntidadeApi<Caixa> {

    @Override
    public Class<Caixa> getClasse() {
        return Caixa.class;
    }

}
